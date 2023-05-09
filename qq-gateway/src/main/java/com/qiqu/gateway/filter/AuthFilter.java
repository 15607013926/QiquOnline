package com.qiqu.gateway.filter;

import com.alibaba.fastjson.JSON;
import com.qiqu.commons.constants.UserConstants;
import com.qiqu.commons.model.vo.AuthInfo;
import com.qiqu.commons.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.concurrent.TimeUnit;

@Component
@Slf4j
public class AuthFilter implements Ordered, GlobalFilter {


    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public int getOrder() {
        return 1;
    }

    // 权限过滤拦截
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // 1.获取request和response对象
        ServerHttpRequest request = exchange.getRequest();
        ServerHttpResponse response = exchange.getResponse();
        // 2.放行部分URI
        // 2-1 获取request中URI
        String path = request.getURI().getPath();
        // 2-2 判断并放行
        if (path.contains("coursePub/preview") ||
                path.contains("/login") ||
                path.contains("basic/dictionary") ||
                path.contains("category/tree-nodes") ||
                path.contains("course/upload") ||
                path.contains("search/") ||
                path.contains("payment/wx/notify")) {
            return chain.filter(exchange);
        }
        // 3.获取请求头中token
        String token = request.getHeaders().getFirst("Authorization");
        // 4.校验token是否合法
        Boolean verifyToken = JwtUtils.verifyToken(token);
        if (!verifyToken) {
            response.setRawStatusCode(401); //   权限不足状态码（前端识别，跳转到登录页面）
            return response.setComplete(); // 响应结果
        }
        // 5.解析token
        AuthInfo authInfo = JwtUtils.getInfoFromToken(token);
        // 6.判断token是否过期
        if (!redisTemplate.hasKey(UserConstants.USER_ID+authInfo.getUid())) {
            response.setRawStatusCode(401); //   权限不足状态码（前端识别，跳转到登录页面）
            return response.setComplete(); // 响应结果
        }
        // 7.判断是否需要续期
        Long expire = redisTemplate.getExpire(UserConstants.USER_ID + authInfo.getUid(), TimeUnit.HOURS);
        if (expire<1) {
            redisTemplate.expire(UserConstants.USER_ID + authInfo.getUid(),3,TimeUnit.HOURS);
        }
        // 8.将authInfo转为json设置到payload头，实现路由转发
        ServerHttpRequest newRequest = request.mutate().header("payload", JSON.toJSONString(authInfo)).build();
        // 将新的request把原来覆盖掉
        ServerWebExchange newExchange = exchange.mutate().request(newRequest).build();

        // 9.放行
        return chain.filter(newExchange);
    }
}

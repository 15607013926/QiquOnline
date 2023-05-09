package com.qiqu.web.interceptor;

import com.alibaba.fastjson.JSON;
import com.qiqu.commons.model.vo.AuthInfo;
import com.qiqu.commons.utils.AuthInfoHolder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j
public class AuthInfoInterceptor implements HandlerInterceptor {


    // 取出payload头存入threadLocal
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 1.取出payload头
        String json = request.getHeader("payload");
        System.out.println(">>>>>>>>>>>>"+json);
        // 2.转为java对象
        AuthInfo authInfo = JSON.parseObject(json, AuthInfo.class);

        // 3.存入TL
        AuthInfoHolder.setAuthInfo(authInfo);
        // 4.放行
        return true;
    }


    // 移除线程内对象
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        AuthInfoHolder.remove();
    }
}

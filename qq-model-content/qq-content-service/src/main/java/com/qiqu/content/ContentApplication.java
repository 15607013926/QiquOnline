package com.qiqu.content;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = RedisAutoConfiguration.class)
@EnableDiscoveryClient
@MapperScan("com.qiqu.content.mapper")
@ComponentScan(basePackages = {
        "com.qiqu.content",  // 内容微服务
        "com.qiqu.web",      // web插件
        "com.qiqu.mybatis"   // mp插件
})
public class ContentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContentApplication.class, args);
    }
}
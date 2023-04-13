package com.qiqu.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author 12441
 * @Date 2023/4/12 1:26
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.qiqu.system.mapper")//指定mapper包扫描范围
@ComponentScan(basePackages = {"com.qiqu.system","com.qiqu.web"})//指定启动类扫描范围
public class SystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class,args);
    }
}

package com.qiqu.apidocument.config;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.nio.file.Paths;

/**
 * @Author 12441
 * @Date 2023/4/14 2:40
 * @Version 1.0
 */
@Configuration
public class SwaggerConfig {
    @Bean
        //Docket 是 Swagger 提供的一个类，它用于定义 Swagger API 的基本信息
        public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.qiqu.system"))
                .paths(PathSelectors.any())
                .build();

    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("启趣在线教育")
                .description("朱微贤毕业设计'启趣在线教育'RESTful接口文档")
                .contact(new Contact("朱微贤","https://152.32.252.204.****","1244120019@qq.com"))
                .version("1.0")
                .build();
    }
}

package com.yxc.redenvelopes.config;

import io.swagger.annotations.ApiOperation;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author Yang Xichun
 * @date 2022/10/8 22:59
 */
@Component
@ConfigurationProperties(prefix = "swagger")
@Data
public class SwaggerConfig {
    private Boolean enabled;

    private String applicationName;

    private String applicationVersion;

    private String applicationDescription;

    private String authorName;

    private String authorUrl;

    private String authorEmail;

    @Bean
    public Docket docket() {
        // apis() 控制哪些接口暴露给swagger，
        // RequestHandlerSelectors.any() 所有都暴露
        // RequestHandlerSelectors.basePackage("net.xdclass.*")  指定包位置
        // withMethodAnnotation(ApiOperation.class) 标记有这个注解 ApiOperation
        return new Docket(DocumentationType.OAS_30)
                .pathMapping("/")
                .enable(enabled)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * API 文档元信息
     *
     * @return API 文档元信息
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(applicationName)
                .description(applicationDescription)
                .contact(new Contact(authorName, authorUrl, authorEmail))
                .version(applicationVersion)
                .build();
    }

}

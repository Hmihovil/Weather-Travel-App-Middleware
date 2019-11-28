package com.dougdev.weathertravelapp.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * URL to access swagger is http://localhost:8080/swagger-ui.html#
 */

public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.baeldung.web.controller"))
                .paths(PathSelectors.ant("/foos/*"))
                .build();
    }

}

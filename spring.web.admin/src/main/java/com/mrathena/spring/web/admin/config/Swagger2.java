package com.mrathena.spring.web.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// http://ip:port/{context-path}/swagger-ui.html

@Configuration
@EnableSwagger2
public class Swagger2 {

	@Bean
	public Docket createApi() {
		ApiInfo info = new ApiInfoBuilder()
            .title("Title")
            .description("Description")
            .termsOfServiceUrl("http://spring.mrathena.top/admin/")
            .version("1.0.0")
            .build();
		return new Docket(DocumentationType.SWAGGER_2)
			.apiInfo(info)
			.select()
			.apis(RequestHandlerSelectors.basePackage("com.mrathena.spring.web.admin.controller"))
			.paths(PathSelectors.any())
			.build();
	}
	
}
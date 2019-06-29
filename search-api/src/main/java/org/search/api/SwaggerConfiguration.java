package org.search.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {
	
	@Bean
	public Docket swaggerSearchApi10() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("search-api-1.0")
				.select()
				.apis(RequestHandlerSelectors.basePackage("org.search.api.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(new ApiInfoBuilder()
						.version("1.0")
						.title("Search API")
						.description("Documentation Search API v1.0")
						.build());
	}

}

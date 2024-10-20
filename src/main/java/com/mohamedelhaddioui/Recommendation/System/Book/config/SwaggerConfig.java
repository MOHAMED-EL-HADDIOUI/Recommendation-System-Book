package com.mohamedelhaddioui.Recommendation.System.Book.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(info()
                        .contact(contact()));
    }

    @Bean
    public Info info() {
        return new Info()
                .title("API Documentation")
                .version("1.0")
                .description("API documentation for the project.");
    }

    @Bean
    public Contact contact() {
        return new Contact()
                .name("MOHAMED EL HADDIOUI")
                .email("mohamedelhaddioui99@mail.com")
                .url("https://github.com/MOHAMED-EL-HADDIOUI");
    }
}

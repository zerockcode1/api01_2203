package org.zerock.api01.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CustomServletConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/generateToken").allowedOrigins("*");
        registry.addMapping("/refreshAccessToken").allowedOrigins("*");

        registry.addMapping("/api/**").allowedOrigins("*");
        registry.addMapping("/guest/**").allowedOrigins("*");
    }


}

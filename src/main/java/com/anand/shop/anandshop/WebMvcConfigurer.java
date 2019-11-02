package com.anand.shop.anandshop;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
@Configuration
public class WebMvcConfigurer {
	 public WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurer() {
	       //     @Override
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/greeting-javaconfig").allowedOrigins("http://localhost:9000");
	            }
	        };
	    }
}

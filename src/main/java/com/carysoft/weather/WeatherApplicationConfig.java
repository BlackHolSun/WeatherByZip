package com.carysoft.weather;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WeatherApplicationConfig {
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.build();
    }

   /* @Bean
    public WeatherService weatherService(RestTemplateBuilder restTemplateBuilder, ObjectMapper objectMapper){
        return new WeatherService(restTemplateBuilder, objectMapper);
    }*/
}
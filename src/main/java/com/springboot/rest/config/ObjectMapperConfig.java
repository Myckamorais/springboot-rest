package com.springboot.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tools.jackson.databind.json.JsonMapper;
import tools.jackson.databind.ser.std.SimpleBeanPropertyFilter;
import tools.jackson.databind.ser.std.SimpleFilterProvider;

@Configuration
public class ObjectMapperConfig {

    @Bean
    public JsonMapper objectMapper() {
        SimpleFilterProvider filters = new SimpleFilterProvider()
                .addFilter("PersonFilter",
                        SimpleBeanPropertyFilter.serializeAllExcept("sensitiveData", "lastName"));

        return JsonMapper.builder()
                .filterProvider(filters)
                .build();
    }

}

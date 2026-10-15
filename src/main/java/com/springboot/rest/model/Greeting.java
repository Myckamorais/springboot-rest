package com.springboot.rest.model;

/**
 * Modelo da resposta de saudação, serializado como {@code {"id":1,"content":"Hello, World!"}}
 */
public record Greeting (Long id, String content){

    
}
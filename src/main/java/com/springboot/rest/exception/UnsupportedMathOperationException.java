package com.springboot.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exceção lançada quando o valor informado para uma operação matemática é inválido.
 * Estende {@code RuntimeException} (não exige {@code throws}) e está marcada com
 * {@code @ResponseStatus(BAD_REQUEST)}, mas na prática quem monta a resposta é o
 * {@code CustomEntityResponseHandler}.
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperationException extends RuntimeException {
    public UnsupportedMathOperationException(String message) {
        super(message);
    }
}
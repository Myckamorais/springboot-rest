package com.springboot.rest.exception;

import java.util.Date;

/**
 * Corpo JSON padrão devolvido quando ocorre um erro na API.
 * É um {@code record}: imutável, com construtor, getters e equals/hashCode gerados.
 *
 * @param timestamp momento em que o erro ocorreu
 * @param message   mensagem da exceção
 * @param details   descrição da requisição (URI) que causou o erro
 */
public record ExceptionResponse (Date timestamp, String message, String details){
}
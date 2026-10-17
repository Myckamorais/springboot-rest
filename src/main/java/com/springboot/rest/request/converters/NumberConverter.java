package com.springboot.rest.request.converters;


import com.springboot.rest.exception.ResourceNotFoundException;

public class NumberConverter {

    /** Converte a String em Double, trocando vírgula por ponto. Lança exceção se vazia ou nula. */
    public static Double convertToDouble(String strNumber) throws IllegalArgumentException{
        if (strNumber == null || strNumber.isEmpty()) throw new ResourceNotFoundException("Please set a numeric value!");
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }

    /** Valida via regex se a String é um número (com sinal e casas decimais opcionais). */
    public static boolean isNumeric (String strNumber){
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", ".");
        return (number.matches("[-+]?[0-9]*\\.?[0-9]+"));
    }
}

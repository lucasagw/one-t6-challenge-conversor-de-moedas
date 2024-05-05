package br.com.alura.exceptions;

public class ExchangeRateApiException extends RuntimeException {

    public ExchangeRateApiException(String message) {
        super(message);
    }
}

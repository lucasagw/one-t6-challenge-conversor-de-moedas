package br.com.alura.exceptions;

public class UnsupportedCodeException extends ExchangeRateApiException {

    public UnsupportedCodeException(String message) {
        super(message);
    }
}

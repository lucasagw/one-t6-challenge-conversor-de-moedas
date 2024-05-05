package br.com.alura.exceptions;

public class InvalidKeyException extends ExchangeRateApiException {

    public InvalidKeyException(String message) {
        super(message);
    }
}

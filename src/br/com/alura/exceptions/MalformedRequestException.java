package br.com.alura.exceptions;

public class MalformedRequestException extends ExchangeRateApiException {

    public MalformedRequestException(String message) {
        super(message);
    }
}

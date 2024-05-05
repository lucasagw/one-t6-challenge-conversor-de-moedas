package br.com.alura.exceptions;

public class InactiveAccountException extends ExchangeRateApiException {

    public InactiveAccountException(String message) {
        super(message);
    }
}

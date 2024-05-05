package br.com.alura.exceptions;

public class QuotaReachedException extends ExchangeRateApiException {

    public QuotaReachedException(String message) {
        super(message);
    }
}

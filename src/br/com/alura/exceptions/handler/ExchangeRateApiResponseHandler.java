package br.com.alura.exceptions.handler;

import br.com.alura.exceptions.*;
import br.com.alura.record.ErrorApiResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ExchangeRateApiResponseHandler {

    public static void handleErrorResponse(String responseBody) {

        Gson gson = new GsonBuilder()
                .create();
        ErrorApiResponse errorResponse = gson.fromJson(responseBody, ErrorApiResponse.class);

        String errorType = errorResponse.errorType();

        switch (errorType) {
            case "unsupported-code":
                throw new UnsupportedCodeException("Unsupported currency code provided.");
            case "malformed-request":
                throw new MalformedRequestException("Malformed request structure.");
            case "invalid-key":
                throw new InvalidKeyException("Invalid API key.");
            case "inactive-account":
                throw new InactiveAccountException("Email address not confirmed.");
            case "quota-reached":
                throw new QuotaReachedException("Request quota reached.");
            default:
                throw new ExchangeRateApiException("Unknown error type: " + errorType);
        }
    }
}

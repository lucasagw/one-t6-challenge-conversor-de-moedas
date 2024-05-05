package br.com.alura.util;

import br.com.alura.exceptions.handler.ExchangeRateApiResponseHandler;
import br.com.alura.record.CurrencyRate;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.MessageFormat;
import java.time.Duration;

import static br.com.alura.constants.CurrencyConverter.CURRENCY_CONVERTER_API;
import static br.com.alura.constants.CurrencyConverter.EXCHANGE_RATE_API_KEY;

public class ConsultCurrencyRate {

    public CurrencyRate getConversionRatesByBaseCode(String baseCode) {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

        URI uri = URI.create(MessageFormat.format(CURRENCY_CONVERTER_API,
                EXCHANGE_RATE_API_KEY, baseCode));

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .timeout(Duration.ofMinutes(2))
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                ExchangeRateApiResponseHandler.handleErrorResponse(response.body());
            }
            return gson.fromJson(response.body(), CurrencyRate.class);
        } catch (IOException e) {
            throw new RuntimeException("Error connecting to currency converter API", e);
        } catch (InterruptedException e) {
            throw new RuntimeException("Currency conversion request interrupted", e);
        }
    }
}
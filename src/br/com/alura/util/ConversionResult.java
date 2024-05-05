package br.com.alura.util;

import br.com.alura.record.CurrencyRate;

import java.math.BigDecimal;

public class ConversionResult {

    public static void convertCurrency(BigDecimal amount, String baseCode, String targetCode) {

        try {
            BigDecimal exchangeRate = getExchangeRate(baseCode, targetCode);
            BigDecimal convertedAmount = amount.multiply(exchangeRate);
            conversionSummary(amount, baseCode, targetCode, exchangeRate, convertedAmount);
        } catch (RuntimeException e) {
            System.out.println("Error converting currency: " + e.getMessage());
        }
    }

    private static BigDecimal getExchangeRate(String baseCode, String targetCode) {

        try {
            ConsultCurrencyRate consultConversionRate = new ConsultCurrencyRate();
            CurrencyRate currencyRate = consultConversionRate.getConversionRatesByBaseCode(baseCode);
            return currencyRate.conversionRates().get(targetCode);
        } catch (RuntimeException e) {
            System.out.println("Error connecting to currency converter API");
            throw e;
        }
    }

    private static void conversionSummary(BigDecimal amount, String baseCode, String targetCode, BigDecimal exchangeRate, BigDecimal convertedAmount) {
        System.out.println("Currency Conversion Summary:");
        System.out.println("------------------------------");
        System.out.println("Amount to Convert: " + amount + " " + baseCode);
        System.out.println("Exchange Rate: " + exchangeRate + " (1 " + baseCode + " = " + exchangeRate + " " + targetCode + ")");
        System.out.println("Converted Amount: " + convertedAmount + " " + targetCode);
        System.out.println("------------------------------");
        System.out.println();
    }

}

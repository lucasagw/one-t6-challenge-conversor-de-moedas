package br.com.alura.record;

import java.math.BigDecimal;
import java.util.Map;

public record CurrencyRate(Map<String, BigDecimal> conversionRates) {
}

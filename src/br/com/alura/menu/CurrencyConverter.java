package br.com.alura.menu;

import java.math.BigDecimal;

import static br.com.alura.util.ConversionResult.convertCurrency;

public class CurrencyConverter {

    public static void displayMenu() {
        System.out.println("======= Currency Converter Options =======");
        int optionNumber = 1;

        for (int base = 1; base <= 9; base++) {
            for (int target = 1; target <= 9; target++) {
                if (target != base) {
                    String baseCurrency = getCurrencyName(base);
                    String targetCurrency = getCurrencyName(target);
                    System.out.println(optionNumber + ". " + baseCurrency + " ("
                            + getCurrencyCode(base) + ") =>> " + targetCurrency + " ("
                            + getCurrencyCode(target) + ")");
                    optionNumber++;
                }
            }
        }
        System.out.println("0. Exit the program");
        System.out.println("=========================================");
    }

    public static void performConversion(int choice, BigDecimal amount) {
        int optionNumber = 1;

        for (int base = 1; base <= 9; base++) {
            for (int target = 1; target <= 9; target++) {
                if (target != base) {
                    if (optionNumber == choice) {
                        String baseCurrency = getCurrencyCode(base);
                        String targetCurrency = getCurrencyCode(target);
                        System.out.printf("Converting %s from %s to %s%n", amount, baseCurrency, targetCurrency);
                        convertCurrency(amount, baseCurrency, targetCurrency);
                        System.out.println();
                        return;
                    }
                    optionNumber++;
                }
            }
        }
    }

    private static String getCurrencyName(int choice) {
        return switch (choice) {
            case 1 -> "US Dollar";
            case 2 -> "Euro";
            case 3 -> "Japanese Yen";
            case 4 -> "British Pound";
            case 5 -> "Canadian Dollar";
            case 6 -> "Swiss Franc";
            case 7 -> "Australian Dollar";
            case 8 -> "New Zealand Dollar";
            case 9 -> "Brazilian Real";
            default -> throw new IllegalArgumentException("Invalid currency choice");
        };
    }

    private static String getCurrencyCode(int choice) {
        return switch (choice) {
            case 1 -> "USD";
            case 2 -> "EUR";
            case 3 -> "JPY";
            case 4 -> "GBP";
            case 5 -> "CAD";
            case 6 -> "CHF";
            case 7 -> "AUD";
            case 8 -> "NZD";
            case 9 -> "BRL";
            default -> throw new IllegalArgumentException("Invalid currency choice");
        };
    }
}

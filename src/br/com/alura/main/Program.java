package br.com.alura.main;

import java.math.BigDecimal;
import java.util.Scanner;

import static br.com.alura.menu.CurrencyConverter.displayMenu;
import static br.com.alura.menu.CurrencyConverter.performConversion;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            System.out.print("Choose a conversion option (or 0 to exit): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting the program. Thank you!");
                break;
            }

            if (choice < 1 || choice > 72) {
                System.out.println("Invalid choice. Please choose a valid option.");
                continue;
            }

            System.out.print("Enter the amount to convert: ");
            BigDecimal amount = scanner.nextBigDecimal();

            performConversion(choice, amount);
        }

        scanner.close();
    }
}

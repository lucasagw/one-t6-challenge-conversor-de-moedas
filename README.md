# Currency Converter Application

This Java application allows you to perform currency conversions between major world currencies using Java 17. It leverages the ExchangeRate API to obtain currency exchange rates and utilizes various Java classes and interfaces for HTTP communication and user input handling.

## Features

- **Menu-Driven Interface**: Choose from a variety of currency conversion options presented in a clear menu format.
- **Currency Exchange Rates**: Utilizes the ExchangeRate API to retrieve up-to-date currency exchange rates.
- **Java Classes and Interfaces**:
  - [Class HttpClient](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpClient.html): Used for making HTTP requests.
  - [Class HttpRequest](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpRequest.html): Represents an HTTP request.
  - [Interface HttpResponse](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpResponse.html): Represents an HTTP response.
  - [Class Scanner](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html): Used for user input handling.
  - [Gson Library](https://mvnrepository.com/artifact/com.google.code.gson/gson): Utilized for JSON serialization and deserialization.

## Main Currencies

The main currencies of the world in terms of usage and economic importance are:

1. US Dollar (USD)
2. Euro (EUR)
3. Japanese Yen (JPY)
4. British Pound (GBP)
5. Canadian Dollar (CAD)
6. Swiss Franc (CHF)
7. Australian Dollar (AUD)
8. New Zealand Dollar (NZD)
9. Brazilian Real (BRL)

## ExchangeRate API

The application uses the [ExchangeRate API](https://www.exchangerate-api.com/) to fetch currency exchange rates.

## Gson Library

[Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson) is a Java library used for converting Java Objects into their JSON representation and vice versa.

## How to Use

1. **Clone the Repository**: `git clone https://github.com/lucasagw/one-t6-challenge-currency-converter`
2. **Navigate to the Project Directory**: `cd currency-converter`
3. **Compile the Java Files**: `javac *.java`
4. **Run the Application**: `java Program`

## Usage Instructions

1. Choose a base currency from the menu.
2. Enter the amount you want to convert.
3. Select a target currency to convert to.
4. View the converted amount and exchange rate details.

## Example

<img src="https://i.ibb.co/XLzHGCG/display-menu-1.jpg" alt="display-menu-1" border="0">
<img src="https://i.ibb.co/0M5qrp1/display-menu-2.jpg" alt="display-menu-2" border="0">
<img src="https://i.ibb.co/McqYmTv/display-menu-3.jpg" alt="display-menu-3" border="0">

## Author
Lucas Augusto Walter


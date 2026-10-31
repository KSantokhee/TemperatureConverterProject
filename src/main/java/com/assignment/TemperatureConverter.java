package com.assignment;

import java.util.Scanner;

public class TemperatureConverter {

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperatureConverter converter = new TemperatureConverter();
        //Implementation of menu based user interface
        System.out.println("=== Temperature Converter ===");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Celsius to Kelvin");
        System.out.print("Choose an option (1-3): ");

        int choice = scanner.nextInt();
        //use scanner to take the input for the conversion choice
        System.out.print("Enter the temperature value to convert: ");
        double inputTemp = scanner.nextDouble();

        double result = 0.0;

        switch (choice) {
            case 1:
                result = converter.fahrenheitToCelsius(inputTemp);
                System.out.println(inputTemp + "°F = " + result + "°C");
                break;
            case 2:
                result = converter.celsiusToFahrenheit(inputTemp);
                System.out.println(inputTemp + "°C = " + result + "°F");
                break;
            case 3:
                result = converter.celsiusToKelvin(inputTemp);
                System.out.println(inputTemp + "°C = " + result + "K");
                break;
            default:
                System.out.println("Invalid option selected.");
        }

        scanner.close();
    }
}
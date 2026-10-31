package com.assignment;

public class Main {

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}
package com.assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {

    @Test
    public void testCelsiusToFahrenheit() {
        // Arrange
        TemperatureConverter converter = new TemperatureConverter();

        // Act - Testing 0°C to Fahrenheit (should be 32°F)
        double result = converter.celsiusToFahrenheit(0.0);

        // Assert
        assertEquals(32.0, result, 0.001, "Freezing point of water should convert to 32.0°F");
    }
}
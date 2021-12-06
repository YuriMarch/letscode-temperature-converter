package com.letscode.converter.services;

public class Calculator {

  public static float convertCelsiusToFahrenheit(float temperatureCelsius){
    final float CONVERSION_FACTOR_FAHRENHEIT = 1.8f;
    final float VARIATION_FAHRENHEIT = 32f;
    return (temperatureCelsius * CONVERSION_FACTOR_FAHRENHEIT) + VARIATION_FAHRENHEIT;
  }

  public static float convertCelsiusToKelvin(float temperatureCelsius){
    final float VARIATION_KELVIN = 273.15f;
    return temperatureCelsius + VARIATION_KELVIN;
  }

  public static float convertCelsiusToReaumur(float temperatureCelsius){
    final float CONVERSION_FACTOR_REAUMUR = 0.8f;
    return temperatureCelsius * CONVERSION_FACTOR_REAUMUR;
  }

  public static float convertCelsiusToRankine(float temperatureCelsius){
    final float CONVERSION_FACTOR_RANKINE = 1.8f;
    final float VARIATION_RANKINE = 491.67f;
    return (temperatureCelsius * CONVERSION_FACTOR_RANKINE) + VARIATION_RANKINE;
  }
}

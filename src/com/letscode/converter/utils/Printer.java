package com.letscode.converter.utils;

import com.letscode.converter.services.Calculator;

public class Printer {

  final static String INPUT_MESSAGE = "Enter temperature in Celsius (℃): ";

  final static String CELSIUS_SYMBOL = "℃";
  final static String FAHRENHEIT_SYMBOL = "°F";
  final static String KELVIN_SYMBOL = "K";
  final static String REAUMUR_SYMBOL = "°Re";
  final static String RANKINE_SYMBOL = "°Ra";

  public static void printInputMessage(){
    System.out.println(INPUT_MESSAGE);
  }

  public static void printResults(float temperatureCelsius){
    System.out.printf("%.2f" + CELSIUS_SYMBOL + " is %.2f" + FAHRENHEIT_SYMBOL + ". %n", temperatureCelsius, Calculator.convertCelsiusToFahrenheit(temperatureCelsius));
    System.out.printf("%.2f" + CELSIUS_SYMBOL + " is %.2f" + KELVIN_SYMBOL + ". %n", temperatureCelsius, Calculator.convertCelsiusToKelvin(temperatureCelsius));
    System.out.printf("%.2f" + CELSIUS_SYMBOL + " is %.2f" + REAUMUR_SYMBOL + ". %n", temperatureCelsius, Calculator.convertCelsiusToReaumur(temperatureCelsius));
    System.out.printf("%.2f" + CELSIUS_SYMBOL + " is %.2f" + RANKINE_SYMBOL + ". %n", temperatureCelsius, Calculator.convertCelsiusToRankine(temperatureCelsius));
  }
}

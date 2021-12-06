package com.letscode.converter.utils;

import java.util.Scanner;

public class Reader {

  public static Scanner temperatureInput;

  public static float scanTemperature(){
    temperatureInput = new Scanner(System.in);
    float celsiusTemperature = temperatureInput.nextFloat();

    return celsiusTemperature;
  }

}

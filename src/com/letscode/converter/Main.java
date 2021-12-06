package com.letscode.converter;

import com.letscode.converter.utils.Printer;
import com.letscode.converter.utils.Reader;

public class Main {

  // visibilidade (escopo)
  // indicador de funcao estatica (quando aplicavel)
  // tipo de retorno (void para nao retornar nada)
  // nome da funcao
  // argumentos da funcao
  public static void main(String[] args){

    Printer.printInputMessage();
    float temperatureCelsius = Reader.scanTemperature();
    Printer.printResults(temperatureCelsius);
  }
}
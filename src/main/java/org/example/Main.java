package org.example;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int gameNumber = Cli.askGame(scanner);
    switch (gameNumber) {
      case 0 -> System.out.println("Bye!");
      case 1 -> Cli.greetGame(scanner);
      case 2 -> EvenGame.play(scanner);
      case 3 -> CalcGame.play(scanner);
      default -> System.out.println("Неправильный ввод!");
    }
    scanner.close();
  }
}
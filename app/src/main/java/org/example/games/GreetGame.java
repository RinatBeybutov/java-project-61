package org.example.games;

import java.util.Scanner;

public class GreetGame {

  public static String play(Scanner scanner) {
    System.out.println("Welcome to the Brain Games!");
    System.out.println("May I have your name?");
    String name = scanner.next();
    System.out.println("Hello, " + name + "!");
    return name;
  }
}

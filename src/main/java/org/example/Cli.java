package org.example;


import java.util.Scanner;

public class Cli {

  public static String greetGame(Scanner scanner) {
    System.out.println("Welcome to the Brain Games!");
    System.out.println("May I have your name?");
    String name = scanner.next();
    System.out.println("Hello, " + name + "!");
    return name;
  }

  public static int askGame(Scanner scanner) {
    var games = """
        Please enter the game number and press Enter.
        1 - Greet
        2 - Even
        3 - Calc
        0 - Exit
        """;
    System.out.println(games);
    int answer = scanner.nextInt();
    System.out.println("Your choice: " + answer);
    return answer;
  }
}

package org.example;


import java.util.Scanner;

public class Cli {

  public static int askGame(Scanner scanner) {
    var games = """
        Please enter the game number and press Enter.
        1 - Greet
        2 - Even
        3 - Calc
        4 - GCD
        5 - Progression
        6 - Prime
        0 - Exit
        """;
    System.out.println(games);
    int answer = scanner.nextInt();
    System.out.println("Your choice: " + answer);
    return answer;
  }
}

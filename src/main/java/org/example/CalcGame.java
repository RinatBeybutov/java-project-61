package org.example;

import static org.example.Cli.greetGame;

import java.util.Scanner;

public class CalcGame {

  public static final int COUNT_THRESHOLD = 3;

  public static void play(Scanner scanner) {
    String name = greetGame(scanner);
    System.out.println("What is the result of the expression?" );

    int countCorrectAnswers = 0;
    while (countCorrectAnswers < COUNT_THRESHOLD) {
      int firstNumber = (int)(Math.random() * 20);
      int secondNumber = (int)(Math.random() * 20);
      System.out.printf("Question: %d * %d %n", firstNumber, secondNumber);
      var expected = firstNumber * secondNumber;
      int answer = scanner.nextInt();
      if (expected == answer) {
        System.out.println("Correct!");
        countCorrectAnswers++;
      } else {
        System.out.println(answer + " is wrong answer ;(. Correct answer was " + expected + ".");
        System.out.println("Let's try again," + name + " !");
        countCorrectAnswers = 0;
      }
    }
    System.out.println("Congratulations," + name + "!");
  }
}

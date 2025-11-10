package org.example.games;

import java.util.Scanner;

public class GCD {

  public static final int COUNT_THRESHOLD = 3;

  public static void play(Scanner scanner) {
    String name = GreetGame.play(scanner);
    System.out.println("Find the greatest common divisor of given numbers.");
    int countCorrectAnswers = 0;
    while (countCorrectAnswers < COUNT_THRESHOLD) {
      int firstNumber = (int)(Math.random() * 50);
      int secondNumber = (int)(Math.random() * 50);
      System.out.printf("Question: %d  %d %n", firstNumber, secondNumber);
      var expected = countGCD(firstNumber, secondNumber);
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

  private static int countGCD(int firstNumber, int secondNumber) {
    while (secondNumber != 0) {
      int temp = secondNumber;
      secondNumber = firstNumber % secondNumber;
      firstNumber = temp;
    }
    return Math.abs(firstNumber);
  }
}

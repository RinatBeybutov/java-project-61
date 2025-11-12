package org.example.games;

import java.util.Scanner;

public class Prime {

  public static final int COUNT_THRESHOLD = 3;

  public static void play(Scanner scanner) {
    String name = GreetGame.play(scanner);
    System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    int countCorrectAnswers = 0;
    while (countCorrectAnswers < COUNT_THRESHOLD) {
      int number = (int) (Math.random() * 100);
      System.out.println("Question: " + number);
      String expected = isPrimeNumber(number);
      var answer = scanner.next();
      if (expected.equals(answer)) {
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

  private static String isPrimeNumber(int number) {
    if (number <= 1) {
      return "no";
    }

    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return "no";
      }
    }

    return "yes";
  }
}

package org.example.games;

import java.util.Scanner;

public class EvenGame {

  public static final int COUNT_THRESHOLD = 3;

  public static void play(Scanner scanner) {
    String name = GreetGame.play(scanner);
    System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    var answer = scanner.next();
    int countCorrectAnswers = 0;
    while (countCorrectAnswers < COUNT_THRESHOLD) {
      int number = (int) (Math.random() * 100);
      System.out.println("Question: " + number);
      String expected = number % 2 == 0 ? "yes" : "no";
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
}

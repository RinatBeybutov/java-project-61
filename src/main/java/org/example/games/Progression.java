package org.example.games;

import java.util.Random;
import java.util.Scanner;

public class Progression {

  private static final int COUNT_THRESHOLD = 3;
  private static final Random random = new Random();

  public static void play(Scanner scanner) {
    String name = GreetGame.play(scanner);
    System.out.println("What number is missing in the progression?");
    int countCorrectAnswers = 0;
    while (countCorrectAnswers < COUNT_THRESHOLD) {
      int expected = generateAndPrintProgression();
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

  private static int generateAndPrintProgression() {
    int length = random.nextInt(6) + 5;
    int firstElement = random.nextInt(20) + 1;
    int difference = random.nextInt(10) + 1;
    int hiddenPosition = random.nextInt(length);

    StringBuilder sb = new StringBuilder();
    int hiddenNumber = 0;

    for (int i = 0; i < length; i++) {
      if (i == hiddenPosition) {
        sb.append("..");
        hiddenNumber = firstElement + i * difference;
      } else {
        sb.append(firstElement + i * difference);
      }
      sb.append(" ");
    }
    System.out.println("Question: " + sb.toString().trim());
    return hiddenNumber;
  }
}

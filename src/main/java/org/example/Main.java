package org.example;

import java.util.Scanner;
import org.example.games.CalcGame;
import org.example.games.EvenGame;
import org.example.games.GCD;
import org.example.games.GreetGame;
import org.example.games.Prime;
import org.example.games.Progression;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int gameNumber = Cli.askGame(scanner);
    switch (gameNumber) {
      case 0 -> System.out.println("Bye!");
      case 1 -> GreetGame.play(scanner);
      case 2 -> EvenGame.play(scanner);
      case 3 -> CalcGame.play(scanner);
      case 4 -> GCD.play(scanner);
      case 5 -> Progression.play(scanner);
      case 6 -> Prime.play(scanner);
      default -> System.out.println("Неправильный ввод!");
    }
    scanner.close();
  }
}
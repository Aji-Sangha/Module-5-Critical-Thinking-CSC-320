package org.temperature;

import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperature {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    ArrayList<String> daysOfWeek = new ArrayList<>();
    ArrayList<Double> averageTemperatures = new ArrayList<>();
    double weeklyAverage = 0.0;

    for (int day = 1; day <= 7; day++) {
      System.out.print("Please enter the day of the week (Monday to Sunday): ");
      String dayOfWeek = input.nextLine();

      System.out.print("Please enter the average temperature for " + dayOfWeek + ": ");
      double temperature = input.nextDouble();
      input.nextLine();

      daysOfWeek.add(dayOfWeek);
      averageTemperatures.add(temperature);
    }

    System.out.print("Please enter 'week' for weekly data or a specific day: ");
    String userInput = input.nextLine();

    if (userInput.equalsIgnoreCase("week")) {

      for (int i = 0; i < 7; i++) {
        System.out.println(daysOfWeek.get(i) + ": " + averageTemperatures.get(i));
        weeklyAverage += averageTemperatures.get(i);
      }
      weeklyAverage /= 7;
      System.out.printf("Weekly Average: %.2f%n", weeklyAverage);
    } else if (daysOfWeek.contains(userInput)) {

      int index = daysOfWeek.indexOf(userInput);
      System.out.println(userInput + ": " + averageTemperatures.get(index));

    } else {
      System.out.println("Invalid input. Please enter a valid day or 'week'.");
    }

    input.close();
  }
}

package _01_basics._03_conditional_statements_advanced.more_exercises;

import java.util.Scanner;

public class _08_Point_on_Rectangle_Border {
  public   static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        boolean onBorder = (x == x1 || x == x2) && (y >= y1 && y <= y2) ||
                (y == y1 || y == y2) && (x >= x1 && x <= x2);

        System.out.println(onBorder ? "Border" : "Inside / Outside");

    }
}

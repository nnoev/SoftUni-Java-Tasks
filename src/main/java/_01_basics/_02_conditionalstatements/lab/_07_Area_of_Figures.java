package _01_basics._02_conditionalstatements.lab;

import java.util.Scanner;

public class _07_Area_of_Figures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if (a.equals("square")) {
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println(b * b);
        } else if (a.equals("rectangle")) {
            double b = Double.parseDouble(scanner.nextLine());
            double c = Double.parseDouble(scanner.nextLine());
            System.out.println(b * c);
        } else if (a.equals("circle")) {
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println(b * b * Math.PI);
        } else if (a.equals("triangle")) {
            double b = Double.parseDouble(scanner.nextLine());
            double hb = Double.parseDouble(scanner.nextLine());
            System.out.println(b * hb / 2);
        }
    }
}

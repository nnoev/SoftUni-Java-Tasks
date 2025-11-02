package _01_basics._01_firststeps.Exercises;

import java.util.Scanner;

public class _08_BasketballEquipment {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int tax = Integer.parseInt(scanner.nextLine());
        double shoes = tax*0.6;
        double suit = shoes*0.8;
        double ball = suit/4;
        double accessories = ball/5;
        double sum = tax+shoes+suit+ball+accessories;
        System.out.println(sum);
    }
}

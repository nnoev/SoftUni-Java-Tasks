package _01_basics._01_firststeps.exercises;

import java.util.Scanner;

public class _08_Basketball_Equipment {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double costSnickers = n - (n * 0.4);
        double costOutfit = costSnickers - (costSnickers * 0.2);
        double costBall = costOutfit / 4;
        double costAccessories = costBall / 5;
        System.out.println(n + costAccessories + costBall + costOutfit + costSnickers);
    }
}

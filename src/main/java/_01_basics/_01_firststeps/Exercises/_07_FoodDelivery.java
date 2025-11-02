package _01_basics._01_firststeps.Exercises;

import java.util.Scanner;

public class _07_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int veggie = Integer.parseInt(scanner.nextLine());
        double desert;
        double priceForMainMeals = chicken * 10.35 + fish*12.4  + veggie*8.15;
        desert = priceForMainMeals*0.2;
        double sum = priceForMainMeals+desert+2.5;
        System.out.println(sum);
    }

}
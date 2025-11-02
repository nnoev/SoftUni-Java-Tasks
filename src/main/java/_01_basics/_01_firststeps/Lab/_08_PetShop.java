package _01_basics._01_firststeps.Lab;

import java.util.Scanner;

public class _08_PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dogFood =Double.parseDouble(scanner.nextLine());
        double catFood =Double.parseDouble(scanner.nextLine());
        double total =dogFood*2.5+catFood*4;
        System.out.println(total+" lv.");
    }
}

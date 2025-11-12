package _01_basics._01_firststeps.exercises;

import java.util.Scanner;

public class _09_Fish_Tank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        double number = Double.parseDouble(scanner.nextLine());
        double volume = n1*n2*n3*0.001;
        double sand = volume*number/100;
        System.out.println(volume-sand);
    }
}

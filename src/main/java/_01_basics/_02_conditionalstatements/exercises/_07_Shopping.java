package _01_basics._02_conditionalstatements.exercises;

import java.util.Scanner;

public class _07_Shopping {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int video = Integer.parseInt(scanner.nextLine());
        int CPU = Integer.parseInt(scanner.nextLine());
        int RAM = Integer.parseInt(scanner.nextLine());
        double videovalue = video*250;
        double CPUvalue = videovalue*0.35*CPU;
        double RAMvalue = videovalue*0.1*RAM;
        double total = videovalue+CPUvalue+RAMvalue;
        if(video>CPU){
            total=total*0.85;
        }
        if(total<=budget){
            System.out.printf("You have %.2f leva left!",budget-total);
        }
        else {
            System.out.printf("Not enough money! You need %.2f leva more!",total-budget);
        }
    }
}

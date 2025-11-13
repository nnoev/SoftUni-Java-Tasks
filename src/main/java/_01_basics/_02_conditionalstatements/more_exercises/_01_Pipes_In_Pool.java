package _01_basics._02_conditionalstatements.more_exercises;

import java.util.Scanner;

public class _01_Pipes_In_Pool {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double water = p1*h+p2*h;
        if (water<=V){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",water/V*100,p1/water*100*h,p2/water*100*h);
        }else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",h,water-V);
        }
    }
}

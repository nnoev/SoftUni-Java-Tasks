package _01_basics._01_firststeps.lab;

import java.util.Scanner;

public class _07_Projects_Creation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.printf("The architect %s will need %d hours to complete %d project/s.",name,n*3,n);
    }
}

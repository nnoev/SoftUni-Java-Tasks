package _01_basics._01_firststeps.more_exercises;

import java.util.Scanner;

public class _06_Fishland {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceSkumria = Double.parseDouble(scanner.nextLine());
        double priceCaca = Double.parseDouble(scanner.nextLine());
        double kilosPalamud = Double.parseDouble(scanner.nextLine());
        double kilosSafrid = Double.parseDouble(scanner.nextLine());
        int kilosMidi = Integer.parseInt(scanner.nextLine());
        double pricePalamud = priceSkumria*1.6;
        double priceSafrid = priceCaca*1.8;
        double sum = kilosPalamud*pricePalamud +priceSafrid*kilosSafrid+kilosMidi*7.5;
        System.out.printf("%.2f",sum);
    }
}

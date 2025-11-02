    package _01_basics._01_firststeps.MoreExercises;

    import java.util.Scanner;

    public class _05_TrainingLab {
        public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           double w =Double.parseDouble(scanner.nextLine());
           double h =Double.parseDouble(scanner.nextLine());
           double a = Math.floor(w/1.2);
           double b = Math.floor((h-1)/0.7);
           double seats = a*b-3;
            System.out.printf("%.0f", seats);
        }
    }

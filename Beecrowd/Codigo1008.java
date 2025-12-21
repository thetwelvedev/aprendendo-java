package Beecrowd;

import java.util.Scanner;

public class Codigo1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int hours = sc.nextInt();
        double valuePerHour = sc.nextDouble();

        double salary = hours * valuePerHour;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        sc.close();
    }
}

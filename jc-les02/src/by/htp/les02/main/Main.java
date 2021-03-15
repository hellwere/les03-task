package by.htp.les02.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.print("Enter a: ");
        }
        a = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter b: ");
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.print("Enter b: ");
        }
        b = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter c: ");
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.print("Enter c: ");
        }
        c = sc.nextDouble();
        sc.nextLine();

        double result = ((b + Math.sqrt(Math.pow(b, 2) + (4 * a * c))) / (2 * a)) - (Math.pow(a, 3) * c) + b;
        System.out.println(result);
    }
}

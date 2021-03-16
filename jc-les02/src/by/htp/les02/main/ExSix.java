package by.htp.les02.main;

import java.util.Scanner;

public class ExSix {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите a: ");

        while (!sc.hasNextDouble()) {
            System.out.print("Введите a: ");
            sc.nextLine();
        }
        a = sc.nextDouble();

        System.out.print("Введите b: ");
        sc.nextLine();
        while (!sc.hasNextDouble()) {
            System.out.print("Введите b: ");
            sc.nextLine();
        }
        b = sc.nextDouble();

        System.out.print("Введите c: ");
        sc.nextLine();
        while (!sc.hasNextDouble()) {
            System.out.print("Введите c: ");
            sc.nextLine();
        }
        c = sc.nextDouble();

        double result = Math.pow(a, 2) - Math.pow((b - c), 2) + Math.log(Math.pow(b, 2) + 1);

        System.out.println("Результат вычисления: " + result);
    }
}

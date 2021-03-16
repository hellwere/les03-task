package by.htp.les02.main;

import java.util.Scanner;

public class ExNine {
    public static void main(String[] args) {
        int count;
        int wholeNumber = 0;
        int multiple = 0;
        int module = 0;
        double currentNumber;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Введите количество чисел: ");
        }
        count = sc.nextInt();
        while (count > 0) {
            sc.nextLine();
            System.out.print("Введите число: ");
            while (!sc.hasNextDouble()) {
                sc.nextLine();
                System.out.print("Введите число: ");
            }
            currentNumber = sc.nextDouble();
            if ((currentNumber % 2) == 0) {
                wholeNumber++;
            }
            if ((currentNumber % 3) == 0) {
                multiple += currentNumber;
            }
            if (Math.abs(currentNumber) < 3) {
                module++;
            }
            count--;
        }
        System.out.println("Количество чётных значений: " + wholeNumber);
        System.out.println("Сумма чисел кратных трём: " + multiple);
        System.out.println("Количество чисел меньше трех: " + module);
    }
}

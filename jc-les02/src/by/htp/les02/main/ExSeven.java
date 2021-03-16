package by.htp.les02.main;

public class ExSeven {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;

        if (a > b) {
            int c = 4;
            int sum = b + c;
            System.out.println(sum);
        } else if (a == b) {
            System.out.println("Конец");
        } else if (a < b) {
            int c = 7;
            int sum = a + b + c;
            System.out.println(sum);
            System.out.println("Новый год!");
        }
    }
}
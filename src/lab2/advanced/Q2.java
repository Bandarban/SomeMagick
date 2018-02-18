package lab2.advanced;

import java.util.Scanner;

import static lab2.Q4.min2;

public class Q2 {

    public static int min4(int a, int b, int c, int d) {
        return (min2(min2(a, b), min2(c, d)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, c = 0, d = 0;
        try {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Некорректный ввод");
        } finally {
            System.out.println(min4(a, b, c, d));
        }
    }
}

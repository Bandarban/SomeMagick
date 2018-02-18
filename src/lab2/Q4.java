package lab2;

import java.util.Scanner;

/**
 * Created by Bandar on 16.02.2018.
 */
public class Q4 {
    public static int min(int a, int b) {
        return (a < b ? a : b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0, n = 0;

        try {

            m = sc.nextInt();
            n = sc.nextInt();


        } catch (Exception t) {
            System.out.println("Некорректный ввод");
        } finally {
            System.out.println(min(m, n));
        }

    }
}

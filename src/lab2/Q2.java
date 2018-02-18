package lab2;

import java.util.Scanner;

/**
 * Created by Bandar on 14.02.2018.
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            int m = sc.nextInt();
            int n = sc.nextInt();


            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(8);
                }
                System.out.println();
            }
        } catch (Exception t) {
            System.out.println("Некорректный ввод");
        }

    }
}


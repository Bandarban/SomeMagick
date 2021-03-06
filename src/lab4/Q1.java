package lab4;

import static lab2.Q4.min2;

public class Q1 {
    /**
     * Рандомная генерация целого числа в диапазоне от меньшего до большего включительно
     */
    public static int randRange(int a, int b) {
        return (int) (min2(a, b) + (Math.random() * Math.abs(b + 1 - a)));
    }

    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        System.out.println("a= " + a + ", b= " + b);
        int[] arr = new int[20];
        for (int num : arr) {
            num = randRange(a, b);
            System.out.print(num + " ");
        }

    }
}

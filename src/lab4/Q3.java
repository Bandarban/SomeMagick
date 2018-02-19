package lab4;

import static lab4.Q1.randrange;
import static lab4.Q2.arrayPrint;

public class Q3 {
    public static void badBubbleSort(int[] arr) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    arr[i] += arr[i + 1];
                    arr[i + 1] = arr[i] - arr[i + 1];
                    arr[i] -= arr[i + 1];
                    flag = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a = (int) (Math.random() * 100), b = (int) (Math.random() * 100);
        System.out.println("a= " + a + ", b= " + b);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randrange(a, b);
        }
        System.out.println("Массив до сортировки: ");
        arrayPrint(arr);
        System.out.println();
        badBubbleSort(arr);
        System.out.println("Массив после сортировки: ");
        arrayPrint(arr);
    }
}

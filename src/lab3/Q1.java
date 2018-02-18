package lab3;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = new int[18 / 2 + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) * 2;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}

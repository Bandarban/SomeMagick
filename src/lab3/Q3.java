package lab3;


public class Q3 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 1) counter++;
        }
        System.out.println("\n" + counter);

    }
}

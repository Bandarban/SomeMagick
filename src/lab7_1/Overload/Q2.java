package lab7_1.Overload;

public class Q2 {
    public static void print(int a) {
        System.out.println(a);
    }

    public static void print(Integer a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Integer four = new Integer(4);
        print(4);
        print(four);
    }

}

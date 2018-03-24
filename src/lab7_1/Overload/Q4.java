package lab7_1.Overload;

public class Q4 {
    public static int min(int a, int b) {
        return a >= b ? b : a;
    }

    public static long min(long a, long b) {
        return a >= b ? b : a;
    }

    public static double min(double a, double b) {
        return a >= b ? b : a;
    }
}

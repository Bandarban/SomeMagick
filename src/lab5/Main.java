package lab5;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(0, 0, 1);
        Circle circle1 = new Circle(0, -10, 1);
        System.out.println(Circle.distanceBetweenCenters(circle, circle1));

    }

}

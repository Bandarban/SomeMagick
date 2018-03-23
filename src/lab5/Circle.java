package lab5;

import java.util.Scanner;

import static lab4.Q1.randRange;

public class Circle {
    public double x, y, r;


    public void printCircle() {
        System.out.println("Окружность с центром (" + x + "; " + y + ") и радиусом " + r);
    }

    public void zoomCircle(double k) {
        r = r * k;
    }

    public void moveCircle(double a, double b) {
        x += a;
        y += b;

    }

    //Q3
    public Circle() {
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        y = sc.nextDouble();
        r = sc.nextDouble();
    }

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    //Q1
    public void lengthCircle() {
        System.out.println("Длина окружности: " + (2 * Math.PI * r));
    }

    //Q2
    public void randomPlace() {
        x = randRange(-99, 99);
        y = randRange(-99, 99);

    }

    //Q4
    public static float distanceBetweenCenters(Circle circle1, Circle circle2) {
        return (float) Math.sqrt(Math.pow(Math.abs(circle1.x - circle2.x), 2) + Math.pow(Math.abs(circle1.y - circle2.y), 2));

    }

    //Q5
    public static boolean oneTouch(Circle circle1, Circle circle2) {
        if (Circle.distanceBetweenCenters(circle1, circle2) == circle1.r + circle2.r) return true;
        if (Circle.distanceBetweenCenters(circle1, circle2) == Math.abs(circle1.r - circle2.r)) return true;
        return false;
    }

}


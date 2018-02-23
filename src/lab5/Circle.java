package lab5;

import lab4.Q1;

import java.util.Scanner;

import static lab4.Q1.randRange;

public class Circle {
    public double x, y, r;


    public void printCircle() {
        System.out.println("Окружность с центром (" + x + ";" + y + ") и радиусом " + r);
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

    public Circle(double a, double b, double s) {
        x = a;
        y = b;
        r = s;
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


}


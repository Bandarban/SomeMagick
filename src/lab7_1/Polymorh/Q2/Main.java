package lab7_1.Polymorh.Q2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        whatClassIsIt(cat);
        ArrayList arrayList = new ArrayList();
        whatClassIsIt(arrayList);

    }

    public static void whatClassIsIt(Object obj) {
        if (obj instanceof Cat) {
            System.out.println("IT'S A CAT!");
            return;
        }
        if (obj instanceof Lama) {
            System.out.println("IT'S A LAMA!");
            return;
        }
        if (obj instanceof Dog) {
            System.out.println("IT'S A DOG!");
            return;
        }
        if (obj instanceof Bird) {
            System.out.println("IT'S A BIRD!");
            return;
        }
        System.out.println("YOU BETRAYED ME!!!");

    }
}

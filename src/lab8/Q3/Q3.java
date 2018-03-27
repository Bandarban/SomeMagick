package lab8.Q3;

import java.util.HashMap;

public class Q3 {

    public static void main(String[] args) {
        HashMap<String, Cat> myMap = new HashMap<>();
        myMap.put("a", new Cat("a"));
        myMap.put("b", new Cat("b"));
        myMap.put("c", new Cat("c"));
        myMap.put("d", new Cat("d"));
        myMap.put("e", new Cat("e"));
        myMap.put("f", new Cat("f"));
        myMap.put("g", new Cat("g"));
        myMap.put("h", new Cat("h"));
        myMap.put("j", new Cat("j"));
        myMap.put("k", new Cat("k"));
        myMap.forEach((s, cat) -> System.out.println(s + " - " + cat.getName()));

    }
}

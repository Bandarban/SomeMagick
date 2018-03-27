package lab8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Q2 {
    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("арбуз", "ягода");
        myMap.put("банан", "трава");
        myMap.put("вишня", "ягода");
        myMap.put("груша", "фрукт");
        myMap.put("дыня", "овощ");
        myMap.put("ежевика", "куст");
        myMap.put("жень-шень", "корень");
        myMap.put("земляника", "ягода");
        myMap.put("ирис", "цветок");
        myMap.put("картофель", "клубень");
        myMap.forEach((s, s2) -> System.out.println(s + " - " + s2));

    }
}

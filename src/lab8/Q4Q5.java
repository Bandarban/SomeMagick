package lab8;

import java.util.HashMap;

public class Q4Q5 {
    public static void keyPrinter(HashMap<String, String> map) {
        map.forEach((s, s2) -> System.out.println(s));
    }

    public static void valuePrinter(HashMap<String, String> map) {
        map.forEach((s, s2) -> System.out.println(s2));
    }

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
        keyPrinter(myMap);
        valuePrinter(myMap);

    }
}

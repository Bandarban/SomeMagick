package lab8;

import java.util.HashMap;

public class Q6 {
    public static void objPrinter(HashMap<String, Object> map) {
        map.forEach((s, o) -> System.out.println(s + " - " + o.toString()));
    }
}

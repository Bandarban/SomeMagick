package lab8;

import java.util.HashSet;
import java.util.Set;

public class Q1 {


    public static void main(String[] args) {
        Set<String> mySet = new HashSet();
        mySet.add("арбуз");
        mySet.add("банан");
        mySet.add("вишня");
        mySet.add("груша");
        mySet.add("дыня");
        mySet.add("ежевика");
        mySet.add("жень-шень");
        mySet.add("земляника");
        mySet.add("ирис");
        mySet.add("картофель");
        mySet.forEach(s -> System.out.println(s));

    }

}

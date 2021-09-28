package Ignore;

import java.util.*;

public class Maps {
    public static void main(String[] args) {

        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John", 12345);
        empIds.put("Carl", 95413);
        empIds.put("Jerry", 46138);

        System.out.println(empIds);

        System.out.println( empIds.get( "Carl" ) );

        System.out.println(empIds.containsKey("Carl"));
        System.out.println(empIds.containsKey("George"));

        System.out.println(empIds.containsValue(12345));

        empIds.put("John", 54321);
        System.out.println(empIds);

        empIds.replace("John", 777);
        System.out.println(empIds);

        empIds.replace("Kramer", 999);
        System.out.println(empIds);

        empIds.putIfAbsent("John", 222);
        System.out.println(empIds);

        empIds.putIfAbsent("Steve", 222);
        System.out.println(empIds);

        empIds.remove("Steve", 222);
        System.out.println(empIds);

    }
}

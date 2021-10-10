package typeinterface;

import java.util.Arrays;
import java.util.HashMap;

public class LocalVariable {


    public static void main(String[] args) {
        noDataType();
    }

    public static void noDataType() {
        var message = "Hello World Java 10";
        System.out.printf(message);

        var map = new HashMap<>();
        map.put("1", "element");
        map.forEach((element, value) -> System.out.println("element " + element + " value " + value));

        var name = getName("me");

        var result = Arrays.asList("1", "2").size();
    }

    private static String getName(String nameAsParameter) {
        var name = nameAsParameter;
        return name;
    }

}

package strings;

import java.sql.SQLOutput;
import java.util.logging.SocketHandler;

public class StringExample {

    public static void main(String[] args) {
        stringCapabilities();
    }

    private static void stringCapabilities() {
        var word = "hello";
        System.out.println(word.repeat(5));

        var wordEmpty = " ";
        System.out.printf("It is blank " + wordEmpty.isBlank());

        var words = "falcon\neagle\nsky\nwood\nforest";
        words.lines().forEach(System.out::println);

        var strip = "\n\t  hello   \u2005";
        System.out.println(strip);
        System.out.println(strip.strip());
    }
}

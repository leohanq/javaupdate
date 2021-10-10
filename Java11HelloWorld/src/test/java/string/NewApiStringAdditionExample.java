package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;

public class NewApiStringAdditionExample {

    @Test
    void whenRepeatTwice_thenGetStringTwice() {
        String result = "La ".repeat(2) + "Land";
        Assertions.assertEquals("La La Land", result);
    }

    @Test
    void whenStripString_thenReturnStringWithoutWhitespaces() {
        String original = "\u0020 hello   \u2002";
        String strip = original.strip();
        System.out.printf("original " + original);
        Assertions.assertEquals("hello", strip);
    }

    @Test
    void whenBlankString_thenReturnTrue() {
        String blank = "";
        Assertions.assertTrue(blank.isBlank());
    }

    @Test
    void whenMultilineString_thenReturnNonEmptyLineCount() {
        String multilineStr = "This \nis a \nmultiline string.";
        System.out.println(multilineStr);
        Stream<String> stream = multilineStr.lines();
        Assertions.assertEquals(3, stream.count());
    }
}

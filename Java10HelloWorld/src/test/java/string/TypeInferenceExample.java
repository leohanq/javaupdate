package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.DirectoryStream;
import java.util.HashMap;
import java.util.function.Predicate;

public class TypeInferenceExample {



    @Test
    void whenVarInitWithString_thenGetStringTypeVar() {
        var message = "Hello World";
        Assertions.assertTrue(message instanceof String);
    }

    @Test
    void whenMap_thenGetMap() {
        var map = new HashMap<Integer, String>();
    }

    @Test
    void whenVarInLambda_thenGetResultNotCompile() {
        Predicate<String> stringFilter = (String s) -> s.length() > 10;
    }
}

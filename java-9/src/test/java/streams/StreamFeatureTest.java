package streams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFeatureTest {

    @Test
    void streamTakeWhileTest() {
        List<String> list= greeting();
        final List<String> names = list.stream().takeWhile(name -> name.length() < 5).collect(Collectors.toList());
        System.out.println(names);
        Assertions.assertEquals(3, names.size());
    }

    @Test
    void streamDropWhileTest() {
        List<String> list= greeting();
        final List<String> names = list.stream().dropWhile(name -> name.length() < 5).collect(Collectors.toList());
        System.out.println(names);
        Assertions.assertEquals(3, names.size());
    }

    private List<String> greeting() {
        return List.of("hola", "que", "tal", "estas", "hoy", "aqui");
    }
}

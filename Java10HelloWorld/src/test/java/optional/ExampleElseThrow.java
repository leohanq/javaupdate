package optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.NoSuchElementException;

public class ExampleElseThrow {

    @Test
    public void whenListElseThrowReturnsInteger() {
        final List<Integer> integers = List.of(1, 3, 5, 7, 9);
        Assertions.assertThrows(NoSuchElementException.class, () -> integers.stream().filter(element -> element % 2 == 0)
                .findFirst()
                .orElseThrow());
    }


    @Test
    public void whenListContainInteger() {
        final List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer integer = integers.stream().filter(element -> element % 2 == 0)
                .findFirst()
                .orElseThrow();
        Assertions.assertEquals(integer, Integer.valueOf(3));
    }
}

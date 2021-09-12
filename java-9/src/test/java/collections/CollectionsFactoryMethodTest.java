package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsFactoryMethodTest {

    @Test
    void createListof() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Assertions.assertEquals(5, numbers.size());
    }

    @Test
    void addElementExceptionTest(){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Assertions.assertThrows(UnsupportedOperationException.class, () -> {
            numbers.add(6);
        });
    }

    @Test
    void nullPointerOnList() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            List<Integer> numbers = List.of(1, 2, 3, 4, null);
        });
    }

    @Test
    void instanceOfNotArrayList() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Assertions.assertTrue(numbers instanceof ArrayList);
    }

    @Test
    void createMap() {
        Map<Integer, String> map = Map.of(1, "a", 2, "b", 3, "c");
        Assertions.assertEquals("a", map.get(1));
    }

    @Test
    void createMapWithDuplicateException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Map<Integer, String> map = Map.of(1, "a", 2, "b", 1, "c");
        });
    }

    @Test
    void createSet() {
        Set<Integer> set = Set.of(1, 2, 3, 4, 5);
        Assertions.assertEquals(5, set.size());
    }

    @Test
    void createSetWithDuplicateException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Set<Integer> set = Set.of(1, 2, 3, 4, 1);
        });
    }
}

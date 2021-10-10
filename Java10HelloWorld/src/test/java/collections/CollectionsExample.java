package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionsExample {

    @Test
    void copyFromListToSet() {
        List<Integer> integers = getIntegers();
        Set<Integer> integerSet = Set.copyOf(integers);
        Assertions.assertEquals(integers.get(4), integerSet.stream().findFirst().get());
    }


    @Test
    void copySetJava10() {
        Set<Integer> setInteger =  Set.of(1, 2, 3, 4, 5);
        Set<Integer> copy = Set.copyOf(setInteger);
        Assertions.assertEquals(setInteger, copy);
        copy.add(6);
        Assertions.assertEquals(6, setInteger.size());
    }


    @Test
    void copyListJava10() {
        final List<Integer> integers = getIntegers();
        List<Integer> copy = List.copyOf(integers);
        Assertions.assertEquals(integers, copy);
        copy.add(6);
        Assertions.assertEquals(6, copy.size());
    }


    @Test
    void copyListJava8() {
        final List<Integer> integers = getIntegers();
        List<Integer>  copies = integers.stream().collect(Collectors.toList());
        Assertions.assertEquals(integers, copies);
    }

    private List<Integer> getIntegers() {
        final List<Integer> integers = List.of(1, 2, 3, 4, 5);
        return integers;
    }
}

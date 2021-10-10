package predicate;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.function.Predicate.not;

public class PredicateTest {


    @Test
    void whenResult() {
        final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Predicate<Integer> isNumberMayorACinco = number -> number > 5;
        final List<Integer> collect = numbers.stream().filter(not(isNumberMayorACinco)).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}

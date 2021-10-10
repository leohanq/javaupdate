package predicate;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

public class PredicateNegative {


    public static void main(String[] args) {
        var people = getPeople();
        var olderPeople = people.stream().filter(not(age -> age.getAge() > 18)).collect(Collectors.toList());

    }




    private static List<Person> getPeople() {
        return List.of(
                new Person(1),
                new Person(18),
                new Person(2));
    }
}
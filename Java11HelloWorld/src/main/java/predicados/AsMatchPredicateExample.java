package predicados;

import java.util.Arrays;
import java.util.regex.Pattern;

public class AsMatchPredicateExample {

    public static void main(String[] args) {
        match();

    }

    private static void match() {
        var words = Arrays.asList("dog", "Dog", "DOG", "Doggy");
        var pred = Pattern.compile("dog", Pattern.CASE_INSENSITIVE).asMatchPredicate();
        words.forEach(word -> {
            if (pred.test(word)) {
                System.out.printf("%s matches%n", word);
            } else {
                System.out.printf("%s does not match%n", word);
            }
        });

    }
}

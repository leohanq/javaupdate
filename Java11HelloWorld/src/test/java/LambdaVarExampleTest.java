import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

public class LambdaVarExampleTest {

    @Test
    void varInLambdaTest() {
        Predicate<String> predicate = (var element) -> element.contains("M");
    }
}

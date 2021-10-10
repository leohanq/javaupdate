package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CollectionToArrayTest {

    @Test
    void whenTransformCollectionToArray_thenGetSameSize() {
        List<String> names = getNames();
    }

    private List<String> getNames() {
        return List.of("Colombia", "Venezuela", "China", "USA");
    }
}

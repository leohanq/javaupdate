package set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class SetCopyTest {

    @Test
    void copyStringSet() {
        Set<String> setString = Set.of("a", "e", "i", "o", "u");
        Set<String> copy = SetCopy.copySet(setString);
        Assertions.assertEquals(setString, copy);
    }

    @Test
    void copyIntegerSet() {
        Set<Integer> setInteger = Set.of(1, 2, 3, 4, 5);
        Set<Integer> copySet = SetCopy.copySet(setInteger);
        Assertions.assertEquals(setInteger, copySet);
    }
}

package set;

import java.util.Set;

public class SetCopy {

    public static <COLLECT> Set<COLLECT> copySet(Set<COLLECT> set) {
        return Set.copyOf(set);
    }
}
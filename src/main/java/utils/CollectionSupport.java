package utils;

import java.util.HashSet;
import java.util.Set;

public final class CollectionSupport {

    private CollectionSupport() {
    }

    public static <T> Set<T> set(T t) {
        return new HashSet<>();
    }
}

package utils;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public final class LambdaSupport {

    private LambdaSupport() {
    }

    public static Predicate<String> isNotEmpty() {
        return isEmpty().negate();
    }

    public static Predicate<String> isEmpty() {
        return (v -> "".equals(v));
    }

    public static Function<String, String> toUpperCase() {
        return v -> v.toUpperCase();
    }

    public static Function<String, Predicate<String>> isEqual() {
        return t -> v -> v.equals(t);
    }

    public static Predicate<String> non(Predicate<String> stringPredicate) {
        return stringPredicate.negate();
    }

    public static <T> Optional<T> opt(T value) {
        return Optional.ofNullable(value);
    }

}

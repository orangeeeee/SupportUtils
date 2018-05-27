package utils;

import java.math.BigDecimal;
import java.util.function.Function;

public final class Support {

    private Support() {
    }


    public static Integer ofInt(String s) {

        return Integer.valueOf(s);
    }

    public static BigDecimal decimal(final String s) {
        return new BigDecimal(s);
    }

    public static BigDecimal decimal(long l) {

        return BigDecimal.valueOf(l);
    }

    public static BigDecimal decimal(double d) {

        return BigDecimal.valueOf(d);
    }

    public static Function<String, BigDecimal> decimal() {
        return Support::decimal;
    }
}

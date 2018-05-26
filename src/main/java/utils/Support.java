package utils;

import java.math.BigDecimal;
import java.util.function.Function;

public class Support {

    public static Integer ofInt(String s) {
        return Integer.valueOf(s);
    }

    public static BigDecimal decimal(final String s) {
        return new BigDecimal(s);
    }

    public static BigDecimal decimal(long l) {

        return BigDecimal.valueOf(l);
    }

    public static void decimal(double d) {

        BigDecimal.valueOf(d);
    }

    public static Function<String, BigDecimal> decimal() {
        return Support::decimal;
    }
}

package utils;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.lang.reflect.Method;
import java.math.BigDecimal;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SupportTest {

    @Nested
    public class ofIntTest {

        @Test
        public void 変換確認() throws Exception {
            //junit5 + powermockでも良い。
            Method method =
                    Support.class.getDeclaredMethod("ofInt", String.class);
            method.setAccessible(true);
            Integer result = (Integer) method.invoke(null, "1");
            // staticの場合、invokeの第一引数はnullになります。
            assertEquals(Integer.valueOf("1"), result);

        }
    }


    @Nested
    public class decimalArgumentStringTest {


        @Test
        public void 変換確認() throws Exception {
            //junit5 + powermockでも良い。
            Method method =
                    Support.class.getDeclaredMethod("decimal", String.class);
            method.setAccessible(true);
            BigDecimal result = (BigDecimal) method.invoke(null, "1");
            // staticの場合、invokeの第一引数はnullになります。
            assertEquals(new BigDecimal("1"), result);

        }
    }


}

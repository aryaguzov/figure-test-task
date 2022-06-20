package util;

import java.util.Arrays;

public class ValidationUtil {

    private ValidationUtil() {
    }

    public static void checkInputData(double... value) {
        Arrays.stream(value)
                .filter(val -> {
                    if (val <= 0.0) {
                        throw new IllegalArgumentException("Couldn't create an object because the value is equal " + val);
                    }
                    return false;
                }).findFirst();
    }
}

package shaong;

import java.util.stream.IntStream;

/**
 * Created by shaong on 9/6/17.
 */

public class FunctionalHelper {
    private FunctionalHelper(){}

    public static class Conversion {
        public static int doubleToInt(double d) {
            return (int) d;
        }

        public static long doubleToLong(double d) {
            return (long) d;
        }

        public static double intToDouble(int i) {
            return (double) i;
        }

        public static double longToDouble(long l) {
            return (double) l;
        }
    }

    public static class Numbers {
        // Even checks
        public static boolean isEven(int i) {
            return (i & 1) == 0;
        }

        public static boolean isEven(long l) {
            return (l & 1) == 0;
        }

        // Prime checks
        public static boolean isPrime(int i) {
            if(i < 2) return false;
            if(i == 2) return true;
            return IntStream.rangeClosed(2, (int)Math.sqrt((double)i))
                    .boxed()
                    .filter(e -> i % e == 0)
                    .count() == 0;
        }
    }
}

import org.junit.Assert;
import org.junit.Test;
import shaong.FunctionalHelper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalHelperTest {
    @Test
    public void doubleToInt() throws Exception {
        List<Double> init = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Integer> expected = IntStream.rangeClosed(1, 5).boxed().collect(Collectors.toList());
        List<Integer> result = init.stream()
                .map(FunctionalHelper.Conversion::doubleToInt)
                .collect(Collectors.toList());

        Assert.assertEquals(expected, result);
    }

    @Test
    public void doubleToLong() throws Exception {
    }

    @Test
    public void isPrimeTest() {
        List<Integer> numbers = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());
        List<Integer> primes = numbers.stream()
                .filter(FunctionalHelper.Numbers::isPrime)
                .collect(Collectors.toList());

        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);

        Assert.assertEquals(expected, primes);
    }

}
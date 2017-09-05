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
                .map(FunctionalHelper::doubleToInt)
                .collect(Collectors.toList());

        Assert.assertEquals(expected, result);
    }

    @Test
    public void doubleToLong() throws Exception {
    }

}
package algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FibonacciSeriesAlgorithmTest {
    @Test
    void assertGeneratedNElementsOfFebonacciSeries() {
        var actual = new FibonacciSeriesAlgorithm().generateNElements(10);
        var expected = new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        Assert.assertArrayEquals(actual, expected);
    }
}
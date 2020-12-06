package algorithms;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortAlgorithmTest {
    @Test
    public void testArrayIsSorted() {
        final var actual = new int[]{3, 2, 91, -1, 0, 2, 3, 8, 9};
        final var expected = new int[]{-1, 0, 2, 2, 3, 3, 8, 9, 91};
        new BubbleSortAlgorithm().sort(actual);
        Assert.assertArrayEquals(actual, expected);
    }
}

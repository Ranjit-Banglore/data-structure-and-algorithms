package algorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortAlgorithmTest {
    int[] data1, data2, data3;
    int[] expected1 = new int[]{1, 2, 7, 8, 9};
    int[] expected2 = new int[]{-9, 0, 1, 2, 7};
    int[] expected3 = new int[]{-8, 0, 1, 1, 2, 7};

    @Before
    public void init() {
        data1 = new int[]{2, 8, 1, 9, 7};
        data2 = new int[]{2, 0, 1, -9, 7};
        data3 = new int[]{2, -8, 1, 1, 0, 7};
    }

    @Test
    public void testBubbleSortAlgorithm() {
        new BubbleSortAlgorithm().sort(data1);
        new BubbleSortAlgorithm().sort(data2);
        new BubbleSortAlgorithm().sort(data3);
        Assert.assertArrayEquals(data1, expected1);
        Assert.assertArrayEquals(data2, expected2);
        Assert.assertArrayEquals(data3, expected3);
    }

    @Test
    public void testMergeSortAlgorithm() {
        new MergeSortAlgorithm().sort(data1);
        new MergeSortAlgorithm().sort(data2);
        new MergeSortAlgorithm().sort(data3);
        Assert.assertArrayEquals(data1, expected1);
        Assert.assertArrayEquals(data2, expected2);
        Assert.assertArrayEquals(data3, expected3);
    }
}

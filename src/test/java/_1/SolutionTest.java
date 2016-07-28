package _1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author xiebiao
 * @date 7/28/16
 */
public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test0() {
        int[] array = new int[]{0, 4, 3, 0};
        int[] result = solution.twoSum(array, 0);
        Assert.assertArrayEquals(new int[]{0, 3}, result);
    }

    @Test
    public void test1() {
        int[] array = new int[]{0, 0, 4, 3, 9};
        int[] result = solution.twoSum(array, 0);
        Assert.assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void test2() {
        int[] array = new int[]{10, 0, 0, 4, 3, 9};
        int[] result = solution.twoSum(array, 7);
        Assert.assertArrayEquals(new int[]{3, 4}, result);
    }

    @Test
    public void test3() {
        int[] array = new int[]{-1, 0, 0, 4, 3, -1};
        int[] result = solution.twoSum(array, -2);
        Assert.assertArrayEquals(new int[]{0, 5}, result);
    }
}

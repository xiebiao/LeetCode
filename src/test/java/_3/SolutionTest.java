package _3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author xiebiao
 * @date 7/29/16
 */
public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test() {
        int length = solution.lengthOfLongestSubstring("abcabca");
        Assert.assertEquals(3, length);
    }

    @Test
    public void test0() {
        int length = solution.lengthOfLongestSubstring("aaaaaaaa");
        Assert.assertEquals(1, length);
    }

    @Test
    public void test1() {
        int length = solution.lengthOfLongestSubstring("axwa");
        Assert.assertEquals(3, length);
    }

    @Test
    public void test2() {
        int length = solution.lengthOfLongestSubstring("abcabcxxxx");
        Assert.assertEquals(4, length);
    }

    @Test
    public void test3() {
        int length = solution.lengthOfLongestSubstring("abcd");
        Assert.assertEquals(4, length);
    }

    @Test
    public void test_blank_string() {
        int length = solution.lengthOfLongestSubstring("");
        Assert.assertEquals(0, length);
    }

    @Test
    public void test_leetcode_data() {
        int length = solution.lengthOfLongestSubstring("dvdf");
        Assert.assertEquals(3, length);
    }

    @Test
    public void test_leetcode_data2() {
        int length = solution.lengthOfLongestSubstring("agapa");
        Assert.assertEquals(3, length);
    }

    @Test
    public void test_leetcode_data3() {
        int length = solution.lengthOfLongestSubstring("asjrgapa");
        Assert.assertEquals(6, length);
    }

    @Test
    public void test_leetcode_data4() {
        int length = solution.lengthOfLongestSubstring("abba");
        Assert.assertEquals(2, length);
    }
}

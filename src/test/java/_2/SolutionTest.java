package _2;


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
    public void test0() {
        //012
        Solution.ListNode l = new Solution.ListNode(0);
        l.next = new Solution.ListNode(1);
        l.next.next = new Solution.ListNode(2);

        //987
        Solution.ListNode r = new Solution.ListNode(9);
        r.next = new Solution.ListNode(8);
        r.next.next = new Solution.ListNode(7);
        Solution.ListNode result = solution.addTwoNumbers(l, r);
        Assert.assertEquals(9, result.val);
        Assert.assertEquals(9, result.next.val);
        Assert.assertEquals(9, result.next.next.val);

    }

    @Test
    public void test1() {
        //012
        Solution.ListNode l = new Solution.ListNode(0);
        l.next = new Solution.ListNode(1);
        l.next.next = new Solution.ListNode(2);

        //999
        Solution.ListNode r = new Solution.ListNode(9);
        r.next = new Solution.ListNode(9);
        r.next.next = new Solution.ListNode(9);
        Solution.ListNode result = solution.addTwoNumbers(l, r);
        Assert.assertEquals(9, result.val);
        Assert.assertEquals(0, result.next.val);
        Assert.assertEquals(2, result.next.next.val);
        Assert.assertEquals(1, result.next.next.next.val);

    }

    @Test
    public void test2() {
        //000
        Solution.ListNode l = new Solution.ListNode(0);
        l.next = new Solution.ListNode(0);
        l.next.next = new Solution.ListNode(0);

        //999
        Solution.ListNode r = new Solution.ListNode(0);
        r.next = new Solution.ListNode(0);
        r.next.next = new Solution.ListNode(0);
        Solution.ListNode result = solution.addTwoNumbers(l, r);
        Assert.assertEquals(0, result.val);
        Assert.assertEquals(0, result.next.val);
        Assert.assertEquals(0, result.next.next.val);

    }

    @Test
    public void test3() {
        //123
        Solution.ListNode l = new Solution.ListNode(1);
        l.next = new Solution.ListNode(2);
        l.next.next = new Solution.ListNode(3);

        //9998
        Solution.ListNode r = new Solution.ListNode(9);
        r.next = new Solution.ListNode(9);
        r.next.next = new Solution.ListNode(9);
        r.next.next.next = new Solution.ListNode(8);
        Solution.ListNode result = solution.addTwoNumbers(l, r);
        Assert.assertEquals(0, result.val);
        Assert.assertEquals(2, result.next.val);
        Assert.assertEquals(3, result.next.next.val);
        Assert.assertEquals(9, result.next.next.next.val);

    }

    @Test
    public void test4() {
        //-123
        Solution.ListNode l = new Solution.ListNode(-1);
        l.next = new Solution.ListNode(2);
        l.next.next = new Solution.ListNode(3);

        //9998
        Solution.ListNode r = new Solution.ListNode(9);
        r.next = new Solution.ListNode(9);
        r.next.next = new Solution.ListNode(9);
        r.next.next.next = new Solution.ListNode(8);
        Solution.ListNode result = solution.addTwoNumbers(l, r);
        Assert.assertEquals(8, result.val);
        Assert.assertEquals(1, result.next.val);
        Assert.assertEquals(3, result.next.next.val);
        Assert.assertEquals(9, result.next.next.next.val);

    }

    @Test
    public void test_getLength() {
        Solution.ListNode node = new Solution.ListNode(0);
        node.next = new Solution.ListNode(1);
        node.next.next = new Solution.ListNode(2);
        Solution solution = new Solution();
        int length = solution.getLength(node);
        Assert.assertEquals(2, length);
    }

    @Test
    public void test_bug() {
        //18
        Solution.ListNode l = new Solution.ListNode(1);
        l.next = new Solution.ListNode(8);

        //0
        Solution.ListNode r = new Solution.ListNode(0);

        Solution.ListNode result = solution.addTwoNumbers(l, r);
        Assert.assertEquals(1, result.val);
        Assert.assertEquals(8, result.next.val);

    }
}

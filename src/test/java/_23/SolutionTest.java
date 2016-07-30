package _23;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * @author xiebiao
 * @date 7/30/16
 */
public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test() {
        Solution.ListNode node1 = new Solution.ListNode(1);
        node1.next = new Solution.ListNode(2);


        Solution.ListNode node2 = new Solution.ListNode(4);
        node2.next = new Solution.ListNode(9);
        node2.next.next = new Solution.ListNode(21);

        Solution.ListNode node3 = new Solution.ListNode(2);
        node3.next = new Solution.ListNode(9);
        node3.next.next = new Solution.ListNode(18);
        node3.next.next.next = new Solution.ListNode(20);

        List<Solution.ListNode> list = new ArrayList<>();
        list.add(node1);
        list.add(node2);
        list.add(node3);
        Solution.ListNode[] array = new Solution.ListNode[list.size()];
        Solution.ListNode result = solution.mergeKLists(list.toArray(array));
        System.out.println(result);

    }

}

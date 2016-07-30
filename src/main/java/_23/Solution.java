package _23;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiebiao
 * @date 7/30/16
 */
public class Solution {
    public ListNode mergeKLists(Solution.ListNode[] nodeList) {
        if (nodeList == null || nodeList.length == 0) {
            return null;
        }
        Set<Integer> all = new HashSet<>();
        for (int i = 0; i < nodeList.length; i++) {
            ListNode node = nodeList[i];
            all.add(node.val);
            ListNode next = node;
            while ((next = getNext(next)) != null) {
                all.add(next.val);
            }
        }
        //冒泡排序
        Integer[] array = new Integer[all.size()];
        all.toArray(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    Integer temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        ListNode fill = new ListNode(array[0]);
        ListNode result = fill;
        for (int i = 1; i < array.length; i++) {
            Integer val = array[i];
            fill.next = new ListNode(val);
            fill = fill.next;
        }
        return result;
    }

    private ListNode getNext(ListNode node) {
        if (node == null) return null;
        if (node.next != null) {
            return node.next;
        }
        return null;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

package _2;

/**
 * @author xiebiao
 * @date 7/28/16
 */
public class Solution {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode lnode = l1;
        ListNode rnode = l2;
        ListNode _short;
        ListNode _long;
        int llength = getLength(lnode);
        int rlength = getLength(rnode);
        if (llength > rlength) {
            _long = l1;
            _short = l2;
        } else {
            _long = l2;
            _short = l1;
        }
        //==========
        int carry = 0;
        ListNode r = _long.equals(l1) ? l1 : l2;
        while (_long != null) {
            int sum;
            if (_short != null) {
                sum = _long.val + _short.val + carry;
            } else {
                sum = _long.val + carry;
            }
            if (sum >= 10) {
                carry = 1;
                sum = sum - 10;
            } else {
                carry = 0;
            }
            _long.val = sum;
            _short = getNext(_short);
            if (getNext(_long) == null && carry > 0) {
                _long.next = new ListNode(carry);
                break;
            } else {
                _long = getNext(_long);
            }
        }

        return r;
    }

    public int getLength(ListNode node) {
        if (node == null) return 0;
        if (node.next != null) {
            return getLength(node.next) + 1;
        }
        return 0;
    }

    private ListNode getNext(ListNode node) {
        if (node == null) return null;
        if (node.next != null) {
            return node.next;
        }
        return null;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            this.val = x;
        }
    }
}


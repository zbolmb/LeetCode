/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry;
        int cur;
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode n = new ListNode(0);
        ListNode c3 = n;
        while (c1 != null || c2 != null) {
            carry = 0;
            if (c1 == null) {
                c3.val += c2.val;
                if (c3.val > 9) {
                    c3.val -= 10;
                    carry += 1;
                }
                if (carry != 0 || c2.next != null) {
                    c3.next = new ListNode(carry);
                }
                c3 = c3.next;
                c2 = c2.next;
            } else if (c2 == null) {
                c3.val += c1.val;
                if (c3.val > 9) {
                    c3.val -= 10;
                    carry += 1;
                }
                if (carry != 0 || c1.next != null) {
                    c3.next = new ListNode(carry);
                }
                c3 = c3.next;
                c1 = c1.next;
            } else {
                cur = c1.val + c2.val;
                if (cur > 9) {
                    cur -= 10;
                    carry += 1;
                }
                c3.val += cur;
                if (c3.val > 9) {
                    c3.val -= 10;
                    carry += 1;
                }
                if (carry != 0) {
                    c3.next = new ListNode(carry);
                } else if (c1.next != null || c2.next != null) {
                    c3.next = new ListNode(0);
                }
                c3 = c3.next;
                c1 = c1.next;
                c2 = c2.next;
            }
        }
        return n;
    }
}

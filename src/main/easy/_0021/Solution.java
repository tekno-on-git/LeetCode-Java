package main.easy._0021;

import main.struct.ListNode;

/**
 * Solution
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;

        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                temp.next = l2;
                l2 = l2.next;
            } else {
                temp.next = l1;
                l1 = l1.next;
            }

            temp = temp.next;
        }

        temp.next = l1 != null ? l1 : l2;
        return head.next;
    }

    // RECURSION -> as per TAG
    public ListNode mergeTwoListsRecursion(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoListsRecursion(l1.next, l2);
            return l1;
        }

        l2.next = mergeTwoLists(l1, l2.next);
        return l2;
    }
}
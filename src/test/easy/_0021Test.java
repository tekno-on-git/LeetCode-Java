package test.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.easy._0021.Solution;
import main.struct.ListNode;

public class _0021Test {
    @Test
    public void loopTest() {
        final Solution sol = new Solution();
        ListNode ln0 = ListNode.createTestData("[1,2,4]");
        ListNode ln1 = ListNode.createTestData("[1,3,4]");
        assertEquals("[1,1,2,3,4,4]", ListNode.getString(sol.mergeTwoLists(ln0, ln1)));

        ln0 = ListNode.createTestData("[]");
        ln1 = ListNode.createTestData("[]");
        assertEquals("[]", ListNode.getString(sol.mergeTwoLists(ln0, ln1)));

        ln0 = ListNode.createTestData("[]");
        ln1 = ListNode.createTestData("[0]");
        assertEquals("[0]", ListNode.getString(sol.mergeTwoLists(ln0, ln1)));

    }

    @Test
    public void recursionTest() {
        final Solution sol = new Solution();
        ListNode ln0 = ListNode.createTestData("[1,2,4]");
        ListNode ln1 = ListNode.createTestData("[1,3,4]");
        assertEquals("[1,1,2,3,4,4]", ListNode.getString(sol.mergeTwoListsRecursion(ln0, ln1)));

        ln0 = ListNode.createTestData("[]");
        ln1 = ListNode.createTestData("[]");
        assertEquals("[]", ListNode.getString(sol.mergeTwoListsRecursion(ln0, ln1)));

        ln0 = ListNode.createTestData("[]");
        ln1 = ListNode.createTestData("[0]");
        assertEquals("[0]", ListNode.getString(sol.mergeTwoListsRecursion(ln0, ln1)));
    }
}

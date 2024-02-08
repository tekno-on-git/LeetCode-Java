package test.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.medium._0002.Solution;
import main.struct.ListNode;

public class _0002Test {
    @Test
    public void initTest() {
        final var sol = new Solution();
        ListNode ln0 = ListNode.createTestData("[2,4,3]");
        ListNode ln1 = ListNode.createTestData("[5,6,4]");
        assertEquals("Mergerd 3,3", "[7,0,8]", ListNode.getString(sol.addTwoNumbers(ln0, ln1)));

        ln0 = ListNode.createTestData("[0]");
        ln1 = ListNode.createTestData("[0]");
        assertEquals("Mergerd 1,1", "[0]", ListNode.getString(sol.addTwoNumbers(ln0, ln1)));

        ln0 = ListNode.createTestData("[9,9,9,9,9,9,9]");
        ln1 = ListNode.createTestData("[9,9,9,9]");
        assertEquals("Mergerd 7,4", "[8,9,9,9,0,0,0,1]", ListNode.getString(sol.addTwoNumbers(ln0, ln1)));
    }
}

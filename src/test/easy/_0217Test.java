package test.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.easy._0217.Solution;

public class _0217Test {
    @Test
    public void initTest() {
        final var sol = new Solution();
        int[] nums = new int[] { 1, 2, 3, 1 };
        assertEquals(true, sol.containsDuplicate(nums));

        nums = new int[] { 1, 2, 3, 4 };
        assertEquals(false, sol.containsDuplicate(nums));

        nums = new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        assertEquals(true, sol.containsDuplicate(nums));

    }
}

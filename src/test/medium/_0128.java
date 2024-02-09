package test.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.medium._0128.Solution;

public class _0128 {
    @Test
    public void initTest() {
        final var soln = new Solution();
        System.out.println(soln.longestConsecutive(new int[] { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 }));
        assertEquals(4, soln.longestConsecutive(new int[] { 100, 4, 200, 1, 3, 2 }));
        assertEquals(9, soln.longestConsecutive(new int[] { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 }));
    }
}

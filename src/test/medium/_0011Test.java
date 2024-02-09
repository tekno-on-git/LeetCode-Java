package test.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.medium._0011.Solution;

public class _0011Test {
    @Test
    public void initTest() {
        final var soln = new Solution();
        assertEquals(49, soln.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
        assertEquals(1, soln.maxArea(new int[] { 1, 1 }));
    }
}

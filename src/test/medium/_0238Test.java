package test.medium;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import main.medium._0238.Solution;

public class _0238Test {
    @Test
    public void initTest() {
        final var soln = new Solution();
        assertArrayEquals(new int[] { 24, 12, 8, 6 }, soln.productExceptSelf(new int[] { 1, 2, 3, 4 }));
        assertArrayEquals(new int[] { 0, 0, 9, 0, 0 }, soln.productExceptSelf(new int[] { -1, 1, 0, -3, 3 }));
    }
}

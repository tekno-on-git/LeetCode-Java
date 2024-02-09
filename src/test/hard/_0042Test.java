package test.hard;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.hard._0042.Solution;

public class _0042Test {
    @Test
    public void initTest() {
        final var soln = new Solution();
        assertEquals(6, soln.trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
        assertEquals(9, soln.trap(new int[] { 4, 2, 0, 3, 2, 5 }));
    }
}

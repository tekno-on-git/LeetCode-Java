package test.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.medium._0167.Solution;

public class _0167Test {
    @Test
    public void initTest() {
        final var soln = new Solution();

        int[] numbers = new int[] { 2, 7, 11, 15 };
        int target = 9;

        int[] expected = new int[] { 1, 2 };
        int[] got = soln.twoSum(numbers, target);

        assertArrayEquals(expected, got);

        numbers = new int[] { 2, 3, 4 };
        target = 6;

        expected = new int[] { 1, 3 };
        got = soln.twoSum(numbers, target);

        assertArrayEquals(expected, got);

        numbers = new int[] { -1, 0 };
        target = -1;

        expected = new int[] { 1, 2 };
        got = soln.twoSum(numbers, target);

        assertArrayEquals(expected, got);

    }
}

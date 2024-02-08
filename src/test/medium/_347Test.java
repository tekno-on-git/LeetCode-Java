package test.medium;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

import main.medium._347.Solution;

public class _347Test {
    @Test
    public void initTest() {
        final var soln = new Solution();
        int[] expected = new int[] { 1, 2 };
        int[] got = soln.topKFrequent(new int[] { 1, 1, 1, 2, 2, 3 }, 2);

        Arrays.sort(expected);
        Arrays.sort(got);

        System.out.println(Arrays.toString(expected));
        System.out.println(Arrays.toString(got));

        assertArrayEquals(expected, got);
        assertArrayEquals(new int[] { 1 }, soln.topKFrequent(new int[] { 1 }, 1));
    }
}

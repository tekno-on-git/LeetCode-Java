package test.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.easy._0242.Solution;

public class _0242Test {
    @Test
    public void initTest() {
        final var soln = new Solution();

        String s = "anagram";
        String t = "nagaram";
        assertEquals(true, soln.isAnagram(s, t));

        s = "rat";
        t = "car";
        assertEquals(false, soln.isAnagram(s, t));

    }
}

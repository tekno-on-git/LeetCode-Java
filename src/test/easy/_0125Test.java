package test.easy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.easy._0125.Solution;

public class _0125Test {
    @Test
    public void initTest() {
        final var soln = new Solution();
        assertTrue(soln.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(soln.isPalindrome("race a car"));
        assertTrue(soln.isPalindrome(" "));
    }
}

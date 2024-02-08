package test.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.easy._0009.Solution;

public class _0009Test {
    @Test
    public void initTest() {
        final var obj = new Solution();

        assertEquals(true, obj.isPalindrome(121));
        assertEquals(false, obj.isPalindrome(-121));
        assertEquals(false, obj.isPalindrome(10));

    }
}

package test.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.medium._0007.Solution;

public class _0007Test {
    @Test
    public void initTest() {
        final var obj = new Solution();
        assertEquals(321, obj.reverse(123));
        assertEquals(-321, obj.reverse(-123));
        assertEquals(21, obj.reverse(120));

    }
}

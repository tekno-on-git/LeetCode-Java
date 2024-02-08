package test.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.easy._0020.Solution;

public class _0020Test {
    @Test
    public void initTest() {
        final var obj = new Solution();
        assertEquals(true, obj.isValid("()"));
        assertEquals(true, obj.isValid("()[]{}"));
        assertEquals(false, obj.isValid("(]"));

    }
}

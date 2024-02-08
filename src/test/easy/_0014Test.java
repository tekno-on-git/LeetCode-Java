package test.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.easy._0014.Solution;

public class _0014Test {
    @Test
    public void initTest() {
        final var obj = new Solution();
        final String[] param1 = new String[] { "flower", "flow", "flight" };
        final String[] param2 = new String[] { "dog", "racecar", "car" };

        assertEquals("fl", obj.longesCommonPrefix(param1));
        assertEquals("", obj.longesCommonPrefix(param2));

    }
}

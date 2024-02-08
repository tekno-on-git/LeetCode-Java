package src.test.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import src.main.easy._0001.Solution;

public class _0001Test {
    @Test
    public void initTest() {
        final Solution obj = new Solution();
        final int[] test1 = new int[] { 2, 7, 11, 15 };
        final int[] test2 = new int[] { 3, 2, 4 };
        final int[] test3 = new int[] { 3, 3 };

        final int[] res1 = new int[] { 0, 1 };
        final int[] res2 = new int[] { 1, 2 };
        final int[] res3 = new int[] { 0, 1 };

        Assert.assertArrayEquals(res1, obj.twoSum(test1, 9));
        Assert.assertArrayEquals(res2, obj.twoSum(test2, 6));
        Assert.assertArrayEquals(res3, obj.twoSum(test3, 6));

    }

}

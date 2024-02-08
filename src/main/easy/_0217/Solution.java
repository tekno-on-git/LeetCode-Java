package main.easy._0217;

import java.util.HashSet;
import java.util.Set;

/**
 * Solution
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (set.contains(i))
                return true;
            set.add(i);
        }
        return false;
    }
}
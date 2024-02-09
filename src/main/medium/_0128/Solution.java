package main.medium._0128;

import java.util.Arrays;

public class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        if (nums.length == 0)
            return longest;
        if (nums.length < 1000) {
            Arrays.sort(nums);

            int current = 0;

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1])
                    continue;

                if (nums[i] == nums[i - 1] + 1) {
                    current += 1;
                } else {
                    if (current + 1 > longest)
                        longest = current + 1;
                    current = 0;
                }
            }

            return (current + 1 > longest) ? current + 1 : longest;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n > max)
                max = n;
            if (n < min)
                min = n;
        }

        boolean[] seen = new boolean[max - min + 1];
        // Arrays.fill(false);
        for (int n : nums) {
            seen[n - min] = true;
        }

        int current = 0;
        for (int i = 0; i < seen.length; i++) {
            if (seen[i])
                current++;
            else {
                if (current > longest)
                    longest = current;
                current = 0;
            }
        }

        return (longest > current) ? longest : current;
    }
}

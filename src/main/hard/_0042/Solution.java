package main.hard._0042;

public class Solution {
    public int trap(int[] height) {
        if (height.length < 3)
            return 0;

        int n = height.length, maxLeft = height[0], maxRight = height[n - 1];

        int left = 1, right = n - 2, totalWater = 0;

        while (left <= right) {
            if (maxLeft < maxRight) {
                if (maxLeft < height[left]) {
                    maxLeft = height[left];
                } else {
                    totalWater += maxLeft - height[left];
                }

                left++;
            } else {
                if (maxRight < height[right]) {
                    maxRight = height[right];
                } else {
                    totalWater += maxRight - height[right];
                }
                right--;
            }
        }
        return totalWater;

    }
}
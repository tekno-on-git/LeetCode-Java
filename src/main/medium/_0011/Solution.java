package main.medium._0011;

// import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;

public class Solution {
    public int maxArea(int[] height) {
        int areaMax = 0;
        int left = 0;
        int right = height.length - 1;

        while (left != right) {
            int area = abs(left - right) * min(height[left], height[right]);

            if (area > areaMax)
                areaMax = area;

            if (height[left] < height[right]) {
                left++;
            } else
                right--;
        }
        return areaMax;
    }
}

package main.medium._0167;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum < target)
                i++;
            else if (sum > target)
                j--;
            else
                break;
        }

        return new int[] { 1 + i, 1 + j };
    }
}

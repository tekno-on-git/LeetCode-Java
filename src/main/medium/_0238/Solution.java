package main.medium._0238;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] leftArr = new int[l];
        int[] rightArr = new int[l];

        leftArr[0] = 1;
        rightArr[l - 1] = 1;

        int leftProd = 1, rightProd = 1;

        for (int i = 0; i < l - 1; i++) {
            leftProd *= nums[i];
            rightProd *= nums[l - i - 1];

            leftArr[i + 1] = leftProd;
            rightArr[l - i - 2] = rightProd;
        }

        int[] res = new int[l];
        for (int i = 0; i < l; i++) {
            res[i] = leftArr[i] * rightArr[i];
        }
        return res;
    }
}

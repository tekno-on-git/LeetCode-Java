package main.easy._0009;

public class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int temp = x;

        while (x > 0) {
            int lastDigit = x % 10;
            rev = rev * 10 + lastDigit;
            x /= 10;
        }

        return rev == temp;
    }
}
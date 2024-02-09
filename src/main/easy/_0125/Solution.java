package main.easy._0125;

public class Solution {
    public boolean isPalindrome(String s) {
        String cleanStr = cleanString(s);
        if (cleanStr.length() == 0)
            return true;
        int i = 0, j = cleanStr.length() - 1;

        while (i < j) {
            if (cleanStr.charAt(i) != cleanStr.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;

    }

    public String cleanString(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z' || c >= '0' && c <= 9) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

package src.main.easy._0001;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] A, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            final Integer val = map.get(A[i]);

            if (val != null)
                return new int[] { val, i };
            map.put(target - A[i], i);
        }
        return null;
    }
}

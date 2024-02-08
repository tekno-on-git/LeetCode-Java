package main.medium._347;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        Queue<Integer> q = new PriorityQueue<>((a, b) -> freq.get(a) - freq.get(b));

        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        for (int i : freq.keySet()) {
            q.offer(i);
            if (q.size() > k)
                q.poll();
        }

        return q.stream().mapToInt(Integer::intValue).toArray();

    }
}

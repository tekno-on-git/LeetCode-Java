package main.medium._0049;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] freq = new char[26];
            for (char c : s.toCharArray())
                freq[c - 'a']++;
            String encode = String.valueOf(freq);
            map.computeIfAbsent(encode, k -> new ArrayList<>());
            map.get(encode).add(s);
        }

        return new ArrayList<>(map.values());
    }
}

package test.medium;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.junit.Test;

import main.medium._0049.Solution;

public class _0049Test {
    @Test
    public void initTest() {
        final var soln = new Solution();
        String[][] dataset = new String[][] {
                { "bat" }, { "nat", "tan" }, { "ate", "eat", "tea" }
        };

        List<List<String>> expectedList = new ArrayList<>();
        for (var arr : dataset) {
            expectedList.add(Arrays.asList(arr));
        }

        var gotList = soln.groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" });

        assertTrue(expectedList.size() == gotList.size());
        // System.out.println(gotList.toString());
        System.out.println(new HashSet<List<String>>(expectedList).containsAll(new HashSet<List<String>>(gotList)));
        // assertTrue(new HashSet<List<String>>(expectedList).equals(new
        // HashSet<List<String>>(gotList)));

        expectedList = new ArrayList<>();
        expectedList.add(Arrays.asList(new String[] { "" }));

        gotList = soln.groupAnagrams(new String[] { "" });

        assertTrue(expectedList.size() == gotList.size());
        assertTrue(expectedList.containsAll(gotList));
        assertTrue(gotList.containsAll(expectedList));

        expectedList = new ArrayList<>();
        expectedList.add(Arrays.asList(new String[] { "a" }));

        gotList = soln.groupAnagrams(new String[] { "a" });

        assertTrue(expectedList.size() == gotList.size());
        assertTrue(expectedList.containsAll(gotList));
        assertTrue(gotList.containsAll(expectedList));

    }

}

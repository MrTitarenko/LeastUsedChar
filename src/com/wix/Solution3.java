package com.wix;

import java.util.HashMap;
import java.util.Map;

/**
 * Another good solution.
 *
 * Space complexity = O(n)
 * Time complexity = O(n)
 */
public class Solution3 implements Solution {
    public char leastUsedChar(String string) {
        if (string == null || string.length() == 0) return 0;
        if (string.length() < 3) return string.charAt(0);

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : string.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        char result = 0;
        int quantity = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
            if (entry.getValue() < quantity || quantity == 0) {
                quantity = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }
}
package com.wix;

/**
 * The best and most effective solution. Depends only on used character encoding.
 * For most cases, ASCII (256 symbols) will be enough, so:
 *
 * Space complexity = O(1)
 * Time complexity = O(1)
 */
public class Solution1 implements Solution {
    public char leastUsedChar(String string) {
        if (string == null || string.length() == 0) return 0;
        if (string.length() < 3) return string.charAt(0);

        int max = 0;
        final int ASCII = 256;                              //  change it if you use another character encoding
        int[] map = new int[ASCII];
        for (char ch : string.toCharArray()) {
            map[ch]++;
            max = Math.max(max, map[ch]);
        }
        char[] buckets = new char[max + 1];
        for (int i = 0; i < ASCII; i++) {
            if (map[i] > 0)
                buckets[map[i]] = (char) i;
        }
        for (int i = 1; i <= max; i++) {
            if (buckets[i] != 0)
                return buckets[i];
        }
        return 0;
    }
}
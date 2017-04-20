package com.wix;

import java.util.Arrays;

/**
 * Very good solution. But not the best time complexity.
 *
 * Space complexity = O(n)
 * Time complexity = O(n*log(n))
 */
public class Solution2 implements Solution {
    public char leastUsedChar(String string) {
        if (string == null || string.length() == 0) return 0;
        if (string.length() < 3) return string.charAt(0);

        char[] array = string.toCharArray();
        Arrays.sort(array);

        char result = 0;
        int delta = 0;
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            quantity++;
            if (i == array.length - 1 || array[i] != array[i + 1]) {
                if (quantity < delta || delta == 0) {
                    delta = quantity;
                    result = array[i];
                }
                quantity = 0;
            }
        }
        return result;
    }
}
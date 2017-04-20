package com.wix;

import static com.wix.TestCases.*;
import static org.junit.Assert.assertTrue;

public class ParentTest {
    Solution solution;

    public void testEmpty() {
        assertTrue(solution.leastUsedChar(null) == 0);
        assertTrue(solution.leastUsedChar("") == 0);
        assertTrue(solution.leastUsedChar("   ") == ' ');
    }

    public void testSmallStrings() {
        assertTrue(solution.leastUsedChar(STRING_c1) == 'c');
        assertTrue(solution.leastUsedChar(STRING_c2) == 'c');
        assertTrue(solution.leastUsedChar(STRING_c_b) == 'b'
                || solution.leastUsedChar(STRING_c_b) == 'c');
        assertTrue(solution.leastUsedChar(STRING_a_b_c) == 'a'
                || solution.leastUsedChar(STRING_a_b_c) == 'b'
                || solution.leastUsedChar(STRING_a_b_c) == 'c');
        assertTrue(solution.leastUsedChar(STRING_b) == 'b');
        assertTrue(solution.leastUsedChar(STRING_a_b) == 'a'
                || solution.leastUsedChar(STRING_a_b) == 'b');
    }

    public void testBigString1() {
        assertTrue(solution.leastUsedChar(STRING_k1) == 'k');
    }

    public void testBigString2() {
        assertTrue(solution.leastUsedChar(STRING_k2) == 'k');
    }
}
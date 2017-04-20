package com.wix;

import org.junit.Before;
import org.junit.Test;

public class Solution2Test extends ParentTest {

    @Before
    public void before() {
        solution = new Solution2();
    }

    @Test
    public void testEmpty() {
        super.testEmpty();
    }

    @Test(timeout = 1000)
    public void testSmallStrings() {
        super.testSmallStrings();
    }

    @Test(timeout = 1000)
    public void testBigString1() {
        super.testBigString1();
    }

    @Test(timeout = 1000)
    public void testBigString2() {
        super.testBigString2();
    }
}
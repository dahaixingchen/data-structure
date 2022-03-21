package com.fei.showO;

import org.junit.Test;

public class ShowSpaceO {
    //空间复杂度为O(1)
    @Test
    public void showTimeO1() {
        int n = 1000000000;
        int i = 0;
        for (i = 1; i < 1000000000; ) {
            i *= 2;
        }
    }

    //空间复杂度为O(n)
    @Test
    public void showTimeO2() {
        int n = 1000000000;
        int i = 0;
        int[] ii = new int[n];
        for (i = 1; i < 1000000000; ) {
            i *= 2;
        }
    }
}

package com.fei.showO;

import org.junit.Test;

public class ShwoTimeO {
    //时间复杂度为O(1)
    @Test
    public void showTimeO1() {
        int n = 1000000000;
        int i = 0;
        for (i = 1; i < 1000000000; ) {
            i *= 2;
        }
    }

    //时间复杂度为O(n)
    @Test
    public void showTimeO2() {
        int n = 1000000000;
        int i = 0;
        for (i = 1; i < n; ) {
            i++;
        }
    }

    //时间复杂度为O(log(n))
    @Test
    public void showTimeO3() {
        int n = 1000000000;
        int i = 0;
        for (i = 1; i < n; ) {
            i *= 2;
        }
    }

    //时间复杂度为O(nlog(n))
    @Test
    public void showTimeO4() {
        int n = 1000000000;
        int i = 0;
        int j = 0;
        for (i = 1; i < n; ) {
            i *= 2;
            for (j = 1; j < n; ) {
                j++;
            }
        }
    }
}

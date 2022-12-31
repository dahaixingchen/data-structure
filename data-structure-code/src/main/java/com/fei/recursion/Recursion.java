package com.fei.recursion;

import org.junit.Test;

/**
 * @Description: 递归
 * @ClassName: Recursion
 * @Author chengfei
 * @DateTime 2022/12/28 9:58
 **/
public class Recursion {
    @Test
    public void test() {
        int f = f(20);
        System.out.println(f);
    }

    int f(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return f(n - 1) + f(n - 2);
    }
}

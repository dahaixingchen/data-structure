package com.fei;

import java.util.Random;

/**
 * @Description:
 * @ClassName: AA
 * @Author chengfei
 * @DateTime 2022/2/22 20:42
 * <p>
 * 题目：输入一个整数数组，这里定义相邻差值小于等于2的连续几个数字认为是一个桶，整数数组可以改变顺序，求最小的分桶数。
 * 输入：[4, 1, 7, 0, 2, 9]
 * 处理：[4,   1,   7,   0,  2,   9] => 5
 * [0, 1, 2, 4,  7, 9 ] => 2
 * 输出：最小的分桶数
 * 思考：输入数据包含的整数个数最大是多少？
 * 思考：如何在对海量数据的实现上述计算？
 **/
public class AA {
    public static void main(String[] args) {
        int a[] = new int[9];
        int length = a.length;
        for (int i = 0; i < length; i++) {
            Random random = new Random(System.currentTimeMillis());
            a[i] = random.nextInt();
        }
        int temp = 0;
        //排序
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (a[i] > a[j + 1]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }

        int b[] = new int[9];

        //计算相邻的差值
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i + 1] - a[i];

        }
    }
}

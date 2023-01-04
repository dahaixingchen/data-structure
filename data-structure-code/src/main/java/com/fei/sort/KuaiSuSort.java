package com.fei.sort;

import com.fei.util.AssignDataUtil;
import org.junit.Test;

/**
 * @ClassName: KuaiSuSort
 * @Description: TODO
 * @Author chengfei
 * @Date 2019/10/7 9:46
 * @Version 1.0
 **/
public class KuaiSuSort {

    @Test
    public void kuaiSort() {
        int[] arr = AssignDataUtil.fixDataInt();
        quickSortInternally(arr, 0, arr.length - 1);
        System.out.println("排序后的结果");
        System.out.println(AssignDataUtil.toString(arr));
    }

    // 快速排序递归函数，p,r为下标
    private static void quickSortInternally(int[] a, int p, int r) {
        if (p >= r) return;
        int q = partition(a, p, r); // 获取分区点
        quickSortInternally(a, p, q - 1); //处理左边数据
        quickSortInternally(a, q + 1, r); //处理右边数据
    }

    private static int partition(int[] a, int p, int r) {
        //定义“靶数据”，默认取最后一位
        int pivot = a[r];
        //i的左边表示已经“处理过的区间”，右边是未经过处理区间
        int i = p;
        //j表示正在处理的数据
        for (int j = p; j < r; ++j) {
            //需要处理的数据和“靶数据”对比，如果符合条件说明正常处理的数据在预期的位置上，不需要做任何动作
            if (a[j] > pivot) {
                //i==j说明“标志数据”和“处理数据”是同一个数据，不需要调换位置，只需要把“标志数据”移动一位即可
                if (i == j) {
                    ++i;
                } else {
                    //i != j说明“标志数据”落后了，需要和当前处理的数据调换位置
                    int tmp = a[i];
                    a[i++] = a[j];
                    a[j] = tmp;
                }
            }
        }
        int tmp = a[i];
        a[i] = a[r];
        a[r] = tmp;
        return i;
    }

}

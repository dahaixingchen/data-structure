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
        int[] arr = AssignDataUtil.assignDataInt();
        quickSortInternally(arr, 0, arr.length - 1);
        System.out.println("排序后的结果");
        System.out.println(AssignDataUtil.toString(arr));
    }

    // 快速排序递归函数，p,r为下标
    private static void quickSortInternally(int[] a, int p, int r) {
        if (p >= r) return;
        int q = partition(a, p, r); // 获取分区点
        quickSortInternally(a, p, q - 1);
        quickSortInternally(a, q + 1, r);
    }

    private static int partition(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; ++j) {
            if (a[j] < pivot) {
                if (i == j) {
                    ++i;
                } else {
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

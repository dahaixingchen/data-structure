package com.fei.sort;

import com.fei.util.AssignDataUtil;
import org.junit.Test;

/**
 * @Description: TODO: 归并排序:
 * @ClassName: MergeSort
 * @Author chengfei
 * @DateTime 2022/2/4 9:55
 **/
public class MergeSort {
    @Test
    public void iterationMergeSort(){
        double[] arr = AssignDataUtil.assignData();
        int len = arr.length;
        double[] result = new double[len];
        int block, start;

        // 原版代码的迭代次数少了一次，没有考虑到奇数列数组的情况
        for(block = 1; block < len*2; block *= 2) {
            for(start = 0; start <len; start += 2 * block) {
                int low = start;
                int mid = (start + block) < len ? (start + block) : len;
                int high = (start + 2 * block) < len ? (start + 2 * block) : len;
                //两个块的起始下标及结束下标
                int start1 = low, end1 = mid;
                int start2 = mid, end2 = high;
                //开始对两个block进行归并排序
                while (start1 < end1 && start2 < end2) {
                    result[low++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
                }
                while(start1 < end1) {
                    result[low++] = arr[start1++];
                }
                while(start2 < end2) {
                    result[low++] = arr[start2++];
                }
            }
            double[] temp = arr;
            arr = result;
            result = temp;
        }
        result = arr;
        System.out.println("排序后的结果");
        System.out.println(AssignDataUtil.toString(result));
    }

}

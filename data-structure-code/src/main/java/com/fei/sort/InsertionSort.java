package com.fei.sort;

import com.fei.util.AssignDataUtil;
import org.junit.Test;

/**
 * @ClassName: InsertionSort
 * @Description: TODO 插入排序：默认以第一个元素组成有序的数据集，从第二个元素起为需要排序的元素集，
 *                一个一个的从需要排序的元素集中拿出数据，和有序集中的数据比较，让这些元素插入到适合的位置，直到需要排序的元素集中元素为空为止
 * @Author chengfei
 * @Date 2019/10/5 20:14
 * @Version 1.0
 **/
public class InsertionSort {
    @Test
    public void insertionSort() {
        double[] data = AssignDataUtil.assignData();
        double temp;
        //选择排序开始
        for (int i = 1; i < 10; i++) {
            temp = data[i]; //需要插入的元素，默认从数组的第二个元素起
            int j = i - 1;
            //查找插入的合适位置
            for (; j >= 0; j--) {
                if (data[j] > temp) {
                    data[j + 1] = data[j]; // 移动比目标数据大的数（升序）
                } else
                    break;
            }
            data[j + 1] = temp; //插入到合适的位置
        }
        System.out.println("经过排序的数组：");
        System.out.println(toString(data));
    }

    /**
     * @Date 2019/10/5 21:19
     * @methodName toString
     * @Param []
     * @Return java.lang.String
     * @Description: 打印排序数据
     **/
    public String toString(double [] data) {
        String dataStr = "";
        for (int i = 0; i < data.length; i++) {
            dataStr += data[i] + "  ,  ";
        }
        return dataStr;
    }
}

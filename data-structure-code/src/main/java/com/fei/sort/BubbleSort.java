package com.fei.sort;

import com.fei.util.AssignDataUtil;
import org.junit.Test;

/**
 * @Todo: 冒泡排序算法，
 * @Todo: 每次拿出一个元素和后面的所有元素比较大小，直到右边的数据和当前的元素比较符合排序的标准（升序，降序）
 *          外圈的大循环走一轮，一定有一个数字排到对应的位置上，
 *          如：第一次循环，数组的第一位一定会出现整个数组中最大的数（降序排序）
 * @return:{@link null}
 * @DateTime: 2022/2/2 17:04
 */
public class BubbleSort {
    /**
     * @Date 2019/10/5 21:20
     * @methodName GeneralBubbleSort
     * @Param []
     * @Return void
     * @Description: 冒泡算法, 常规写法，第一个位置就放置最大数或是最小的数，之后依次按排序放入
     **/
    @Test
    public void GeneralBubbleSort() {
        double[] data = AssignDataUtil.assignData();
        double temp;
        //冒泡排序开始
        int length = data.length;
        for (int i = 0; i < length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < length - i; j++) {
                if (data[i] > data[j]) { //升序排序
                    temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
        System.out.println("排序之后的数据");
        System.out.println(this.toString(data));
    }

    /**
     * @Date 2019/10/5 21:39
     * @methodName goodBubbleSort
     * @Param []
     * @Return void
     * @Description: 把最大值或是最小放置在最后，然后依次放入，在没有数据交换的时候提前退出
     **/
    @Test
    public void goodBubbleSort() {
        double[] data = AssignDataUtil.assignData();
        double temp;

        //冒泡排序开始
        int length = data.length;
        for (int i = 0; i < length; i++) {
            boolean flag = false; //结束冒泡的标志
            for (int j = 0; j < length - i - 1; j++) {
                if (data[j] < data[j + 1]) { //升序排序
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break; // 没有数据交换，提前退出
        }
        System.out.println(toString(data));
    }

    /**
     * @Date 2019/10/5 21:19
     * @methodName toString
     * @Param []
     * @Return java.lang.String
     * @Description: 打印排序数据
     **/
    public String toString(double[] data) {
        String dataStr = "";
        for (int i = 0; i < data.length; i++) {
            dataStr += data[i] + "  ,  ";
        }
        return dataStr;
    }
}


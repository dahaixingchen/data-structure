package com.fei.util;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * @Description: 需要排序的数据初始化
 * @ClassName: AssignDataUtil
 * @Author chengfei
 * @DateTime 2022/2/2 17:48
 **/
public class AssignDataUtil {
    static final int DATA_LENGTH = 10;
    static double[] data = new double[DATA_LENGTH];

    static public double[] assignData() {
        AssignDataUtil assignDataUti = new AssignDataUtil();
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("#.00");
        for (int i = 0; i < DATA_LENGTH; i++) {
            data[i] = Double.parseDouble(df.format((random.nextDouble()) * 100));
        }
        System.out.println("排序之前的数据");
        System.out.println(assignDataUti.toString());
        return data;
    }

    public String toString() {
        String dataStr = "";
        for (int i = 0; i < data.length; i++) {
            dataStr += data[i] + "  ,  ";
        }
        return dataStr;
    }

    static public String toString(double [] data) {
        String dataStr = "";
        for (int i = 0; i < data.length; i++) {
            dataStr += data[i] + "  ,  ";
        }
        return dataStr;
    }
}

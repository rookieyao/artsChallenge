package com.rookie.fourthWeek;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @创建人 rookie
 * @创建时间 2019/6/15
 * @描述 两个排好序的数组合并成一个数组并且排好序
 */
public class SortedArray {


    /**
     * 先合并数组再排序  不是最优解
     * @param args
     */
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 7, 9};
        int[] b = {3, 5, 6, 8};

        List<Integer> list = new ArrayList<Integer>();

        for (int j = 0; j < a.length; j++) {
            list.add(a[j]);
        }

        for(int i = 0; i<b.length; i++){
            list.add(b[i]);
        }

        Integer[] result = list.toArray(new Integer[list.size()]);

        Arrays.sort(result);

//        for(int m=0; m<result.length-1; m++){
//
//            for(int n =1; n<result.length; n++){
//                if()
//            }
//
//            if(result[m] > result[m+1]){
//                int temp = result[m];
//                result[m] = result[m+1];
//                result[m+1] = temp;
//            }
//        }

        for(Integer i:result){
            System.out.println(i);
        }

    }
}

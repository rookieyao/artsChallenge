package com.rookie.thirdWeek;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @创建人 rookie
 * @创建时间 2019/6/8
 * @描述
 * 给出 2 * n + 1个数字，除其中一个数字之外其他每个数字均出现两次，找到这个数字
 */
public class FindNuber {

    public static void main(String[] args) {

        int[] iArr= {2,3,3,2,4,5,4,5,88};

        System.out.println(findNum(iArr));

    }

    public static Integer findNum(int[] iArr){
        for (int i = 0; i < iArr.length; i++) {
            int count = 1;
            for(int j = 0; j<iArr.length; j++){

                if(i == j)
                    continue;
                if(iArr[i] == iArr[j]){
                    count++;
                }
            }
            if( count == 1){
                return iArr[i];
            }
        }
        return null;
    }
}

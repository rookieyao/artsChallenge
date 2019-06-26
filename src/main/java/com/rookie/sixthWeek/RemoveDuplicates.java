package com.rookie.sixthWeek;

import java.util.HashSet;
import java.util.Set;

/**
 * @创建人 rookie
 * @创建时间 2019/6/26
 * @描述   去除数组中相同的元素并且返回去除之后的数组长度。
 */
public class RemoveDuplicates {

    public static int removeSameNums(Integer[] intArray){
        Set<Integer> noRepeatNum = new HashSet<Integer>();
        for(Integer i:intArray){
            noRepeatNum.add(i);
        }
        return noRepeatNum.size();
    }
    public static void main(String[] args) {
        Integer[] array = {1,1,2,3,3,4,5,5,6,7,8,8,9,9};
        System.out.println(removeSameNums(array));
    }
}

package com.rookie.firstWeek;

import java.util.Locale;

/**
 * @创建人 rookie
 * @创建时间 2019/5/26
 * @描述
 */
public class Fibonaccis {

    /**
     * @参数
     *@描述
     *@返回值
     *@创建人  rookie
     *@创建时间  2019/5/26
     *@修改人和其它信息
     */
    public static long[] generateFibonaccis(int n){
        long[] fib = new long[n];
        fib[0] = 1;
        fib[1] = 1;
        for(int i = 2; i<n; i++){
            fib[i] = fib[i-2] + fib[i-1];
        }
        return fib;
    }

    public static void main(String[] args) {

        int n = 10;
        long[] fib = generateFibonaccis(n);
        for(int i =0; i<n; i++){
            System.out.println(fib[i]+ " ");
        }

    }
}

package com.rookie.fifthWeek;

import java.util.HashMap;

/**
 * @创建人 rookie
 * @创建时间 2019/6/23
 * @描述
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 */
public class FindUniqueChar {


    public static int firstUniqueChar(String s){

        HashMap<String,Integer> charMap = new HashMap<String, Integer>();
        String[] chars = s.split("");
        for(int i=0; i<chars.length; i++){
            if(charMap.containsKey(chars[i])){
                charMap.put(chars[i]+"",charMap.get(chars[i]+"")+1);
            }else{
                charMap.put(chars[i]+"",1);
            }
        }

        for(int i=0; i<chars.length; i++){
            if(charMap.get(chars[i]+"") == 1){
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        String str = "leetcode";

        String s = "loveleetcode";

        System.out.println(firstUniqueChar(str));

        System.out.println(firstUniqueChar(s));
    }
}

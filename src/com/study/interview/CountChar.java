package com.study.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountChar {

    public static void main(String[] args) {
        countChar("java");
    }
    public static void countChar(String str){
//        char [] chaArr = str.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (char charArray : str.toCharArray()) {
            if (map.containsKey(charArray)) {
                map.put(charArray, map.get(charArray)+1);
            }else {
                map.put(charArray,1);
            }

        }
        System.out.println(map);
    }

}

package com.study.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharTest {

    public static void main(String[] args) {
        countChar("java");
    }
    public static void countChar(String str){
         char [] chaArr = str.toCharArray();//to convert string into Array
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < chaArr.length; i++) {
            if (map.containsKey(chaArr[i])){
                map.put(chaArr[i],map.get(chaArr[i])+1);
            }else {
                map.put(chaArr[i],1);
            }
        }

        System.out.println(map);
    }
}

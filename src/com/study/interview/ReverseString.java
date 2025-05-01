package com.study.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class ReverseString {
    public static void main(String[] args) {
        reverseString ("java");
    }

    public static void reverseString(String str) {
        char [] charArray = str.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            if(!map.containsKey(charArray[i])){
                map.put(charArray[i], 1);
            }else {
                map.put(charArray[i],map.get(charArray[i])+1);

            }


        }
        System.out.println(map);

            }
        }

package com.study.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingCharFromGivenString {

    public static void main(String[] args) {
        countChar("vijayapur");
    }
    public static void countChar(String str){
//        char [] chaArr = str.toCharArray();//to convert string into Array
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (char charArray : str.toCharArray()) {
            if (map.containsKey(charArray)){
                map.put(charArray,map.get(charArray)+1);
            }else {
                map.put(charArray,1);
            }
        }
       for (Map.Entry<Character,Integer> entry: map.entrySet()){
           if(entry.getValue()>=2){
               System.out.println(entry.getKey());
               break;

           }
       }
            }
        }





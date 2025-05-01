package com.study.interview;

import java.util.Map;
import java.util.stream.Collectors;

public class CountCharUsingJava8 {

    public static void main(String[] args) {
        getCountChar("vishuvardan");
    }

    public  static void getCountChar(String str){
        Map<Character, Long> result = str.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        System.out.println(result);
    }

}

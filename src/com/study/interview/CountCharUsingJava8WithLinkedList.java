package com.study.interview;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class CountCharUsingJava8WithLinkedList {

    public static void main(String[] args) {
        countChar("java");
    }

    public static void countChar(String str) {
        LinkedHashMap<Character, Long> result = str.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()));
        System.out.println(result);
    }
}

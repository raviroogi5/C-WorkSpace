package com.study.interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CharString {

    public static void main(String[] args) {
        List<String> name = Arrays.asList("dog", "cat", "rabbit", "fox", "zebra", "elephent", "ant");
        charCountString(name);
    }

    public static void charCountString(List<String> names) {

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (String str : names) {
            int length = str.length();
            map.put(length, map.getOrDefault(length, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Strings with length " + entry.getKey() + ": " + entry.getValue());
        }
    }
}

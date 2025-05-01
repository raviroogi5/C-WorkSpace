package com.study.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCountNumber {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 2,5,5};
        countCharNumber(numbers);
    }

    public static void countCharNumber(int[] number) {
        Map<Integer, Integer> numberCountMap = new LinkedHashMap<>();

        for (int num : number) {
            if (numberCountMap.containsKey(num)) {
                numberCountMap.put(num, numberCountMap.get(num) + 1);
            } else {
                numberCountMap.put(num, 1);
            }
        }

        // Print number occurrences
        System.out.println(numberCountMap);

        for (Map.Entry<Integer,Integer>entry: numberCountMap.entrySet()){
            if (entry.getValue()==1){
                System.out.println(entry.getKey());

            }

        }
    }

}

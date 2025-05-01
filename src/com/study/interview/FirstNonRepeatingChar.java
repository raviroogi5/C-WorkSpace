package com.study.interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        firstNonReapCha("wwrttyu");

    }

    public static void firstNonReapCha(String name) {
        Map<Character,Integer>map = new LinkedHashMap<>();
        for (char charArray : name.toCharArray()){
            if (map.containsKey(charArray)){
                map.put(charArray,map.get(charArray)+1);

            }else {
                map.put(charArray,1);
            }
        }
for (Map.Entry<Character,Integer>ensSet:map.entrySet()){
    if (ensSet.getValue()==1){
        System.out.println(ensSet.getKey());
        break;
    }
    Optional<Character> outPut = map.entrySet().stream()
            .filter(i -> i.getValue() == 1)
            .map(i -> i.getKey()).findFirst();
    System.out.println(outPut);
}

    }

}

package com.study.basic;

public class FindOddEvenNumber {

    public static void main(String[] args) {
      int[] arr = {2,4,5,6,7,8,1,2};
//        oddEvenNumber(arr);
        increanmet(arr);

    }

    public static void increanmet(int[] args) {
        for (int a : args){
            System.out.println(a+5);

        }

    }

    public static void oddEvenNumber(int[] arr) {
        for (int a : arr){
            if ( a%2==0){
                System.out.println("" +a);
            }
        }
    }
}

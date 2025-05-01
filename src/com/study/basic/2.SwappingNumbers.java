package com.study.basic;

 class SwappingNumbers {

    public static void main(String[] args) {
        swappingTwoNumbers(10,20);

    }

    public static void swappingTwoNumbers(int a, int b) {
        System.out.println("  Before Swapping Two Numbers A = " + a + " B =  " + b);
        a = a + b;
        b = a - b;
        a = a - b ;
        System.out.println("  After Swapping Two Numbers A = " + a + " B =  " + b);

    }
}

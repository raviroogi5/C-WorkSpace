package com.study.basic;

 class PositiveNegativeZero {

    public static void main(String[] args) {
        positiveNegativeZero(0);

    }

    public static void positiveNegativeZero(int num) {
        if (num > 0){
            System.out.println("The Number is Positve :");
        }else if (num==0){
            System.out.println("The NUmber is Zero");
        }else {
            System.out.println("The Number is Negative");
        }

    }
}

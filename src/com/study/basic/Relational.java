package com.study.basic;

public class Relational {

    public static void main(String[] args) {
        relational(2,true);

    }

    public static void relational(int age,boolean isFemale) {

if (age<5){
    System.out.println("The Discount is 25 % :" +age);
}else  if (age>= 60 && isFemale){
    System.out.println("The Discountis 50 %" +age + "" + isFemale);
}else if (age >= 60 && !isFemale){
    System.out.println("The Discount is 75 %" + age + "" + isFemale);
}else {
    System.out.println("No Discoutn");
}
    }


}

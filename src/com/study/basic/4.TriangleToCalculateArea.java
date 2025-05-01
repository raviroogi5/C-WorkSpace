package com.study.basic;

 class TriangleToCalculateArea {

    public static void main(String[] args) {
        triangleArea(2.5,3.5);

    }

    public static void triangleArea(double length, double breath) {

        double Area = 1/2*(length*breath);
        System.out.println("The Calculated Area is : " + Area);


    }
}

package com.javarush.task.pro.task12.task1205;

/* 
Double.POSITIVE_INFINITY, если верен любой из следующих пунктов:
a положительное и b равно 0;
a равно Double.POSITIVE_INFINITY и b >= 0 и b не равно Double.POSITIVE_INFINITY;
a равно Double.NEGATIVE_INFINITY и b < 0 и b не равно Double.NEGATIVE_INFINITY;



Double.NEGATIVE_INFINITY, если верен любой из следующих пунктов:
a отрицательное и b равно 0;
a равно Double.NEGATIVE_INFINITY и b >= 0 и b не равно Double.POSITIVE_INFINITY;
a равно Double.POSITIVE_INFINITY и b < 0 и b не равно Double.NEGATIVE_INFINITY;


Double.NaN, если верен любой из следующих пунктов:
a равно 0 и b равно 0;
хотя бы один из операндов равен Double.NaN;

a равно Double.POSITIVE_INFINITY и b равно Double.POSITIVE_INFINITY;
a равно Double.POSITIVE_INFINITY и b равно Double.NEGATIVE_INFINITY;
a равно Double.NEGATIVE_INFINITY и b равно Double.POSITIVE_INFINITY;
a равно Double.NEGATIVE_INFINITY и b равно Double.NEGATIVE_INFINITY;
*/

public class Solution {

    public static void main(String[] args) {
//        divide(1, 0);
//        divide(-1, 0);
//        divide(0, 0);
//        divide(100, 20);
//        divide(200, 20);

        System.out.println();
        divide(Double.NEGATIVE_INFINITY, 1);
    }

    public static void divide(double a, double b) {
        if (a > 0 && b == 0 ||
            a == Double.POSITIVE_INFINITY && b >= 0 && b != Double.POSITIVE_INFINITY||
            a == Double.NEGATIVE_INFINITY && b < 0 && b != Double.NEGATIVE_INFINITY) {
                System.out.println(Double.POSITIVE_INFINITY);
        } else if (a < 0 && b == 0 ||
            a == Double.NEGATIVE_INFINITY && b >= 0 && b != Double.POSITIVE_INFINITY ||
            a == Double.POSITIVE_INFINITY && b < 0 && b != Double.NEGATIVE_INFINITY) {
                System.out.println(Double.NEGATIVE_INFINITY);
        } else if (a == Double.POSITIVE_INFINITY && b == Double.POSITIVE_INFINITY ||
                    a == Double.POSITIVE_INFINITY && b == Double.NEGATIVE_INFINITY ||
                    a == Double.NEGATIVE_INFINITY && b == Double.POSITIVE_INFINITY ||
                    a == Double.NEGATIVE_INFINITY && b == Double.NEGATIVE_INFINITY) {
            System.out.println(Double.NaN);
        } else {
            System.out.println(a / b);
        }

    }
}

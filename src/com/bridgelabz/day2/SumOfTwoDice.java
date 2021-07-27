package com.bridgelabz.day2;


public class SumOfTwoDice {
    public static void main(String[] args) {
        int num1, num2 , sum;

        num1= (int) Math.floor(Math.random() * 10 % 6);
        num2 = (int) Math.floor(Math.random() * 10 % 6);

        System.out.println("1stRandom Number: "+num1);
        System.out.println("2nd Random Number: "+num2);

        sum = num1 + num2;
        System.out.println("Sum of Two Random Number Is : "+sum);
    }
}

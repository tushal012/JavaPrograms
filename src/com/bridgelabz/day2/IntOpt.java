package com.bridgelabz.day2;

import java.util.Scanner;

public class IntOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,num1,num2,num3,num4;
        System.out.println("Enter Value of a , b , c :");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        num1 = a + b * c;
        num2 = a * b + c;
        num3 = c + a / b;
        num4 = a % b + c;

        System.out.println("num1 = a + b * c "+num1);
        System.out.println("num2 = a * b + c "+num2);
        System.out.println("num3 = c + a / b "+num3);
        System.out.println("num4 = a % b + c "+num4);

    }
}

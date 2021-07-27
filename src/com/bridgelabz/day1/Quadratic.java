package com.bridgelabz.day1;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,x =0,y = 0;
        double delta=0,equation1,equation2;

        System.out.println("Enter value of a,b,c: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        delta = b*b - 4*a*c;

        y = (-b + Math.sqrt(delta))/(2*a);
        x = (-b - Math.sqrt(delta))/(2*a);

        equation1 = a * y * y + b*y + c;
        equation2 = a * x * x + b*x + c;
        System.out.println(equation1);
        System.out.println(equation2);
    }
}

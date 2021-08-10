package com.bridgelabz.day9;

import com.bridgelabz.util.Utility;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Utility utility=new Utility();
        Scanner scanner = new Scanner(System.in);
        int c;
        double result;
        System.out.println("Enter value");
        c = scanner.nextInt();
        if (c > 0) {
            result = utility.findSquareRootUsingNewtonsMethod(c);
            System.out.println("Square Root of " + c + " using Newtons Law is " + result);
        } else {
            System.out.println("Please enter positive value..");
        }
    }
}

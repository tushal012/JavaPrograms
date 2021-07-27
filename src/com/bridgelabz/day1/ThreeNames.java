package com.bridgelabz.day1;

import java.util.Scanner;

public class ThreeNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");

        int size;
        size = sc.nextInt();
        String Names[] = new String[size];
        int j;
        System.out.println("Enter Elements of Array : ");

        for (int i=0;i<size;i++){
            Names[i]= sc.nextLine();
        }
        System.out.println("After Reversing Array Elements--> ");

        System.out.print("Hi ");
        for (int i=size-1;i>=0;i--)
            System.out.print("" +Names[i]+ " ");
    }
}

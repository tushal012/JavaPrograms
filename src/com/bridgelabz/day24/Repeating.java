package com.bridgelabz.day24;

import java.util.Scanner;

public class Repeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < n; i++) // select an element
            for (int j = i + 1; j < n; j++) //traverse  and check for duplicate
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    temp = 1;
                    i = n;
                    j = n;
                }
        if (temp == 0)
            System.out.println("No repeating integer ");
    }
}

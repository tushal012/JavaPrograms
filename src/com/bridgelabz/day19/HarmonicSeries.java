package com.bridgelabz.day19;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        double result = 0.0;

        System.out.println("The harmonic series is: ");

        // printing the harmonic series till num value
        // using while loop
        while (num > 0) {

            // calculating harmonic values
            result = result + (double) 1 / num;

            num--;
            System.out.print(result + ", ");
        }
    }
}

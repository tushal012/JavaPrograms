package com.bridgelabz.day1;

import java.util.Scanner;

public class Spring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Month : ");
        int month = sc.nextInt();
        System.out.println("Enter Day : ");
        int day = sc.nextInt();

        if ((month == 4 || month == 5) && (day <= 30 && day != 0)) {
            System.out.println("Summer");
        } else if (month == 6 && day <= 20) {
            System.out.println("Rainy");
        } else
            System.out.println("false");
    }
}


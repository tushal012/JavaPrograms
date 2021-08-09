package com.bridgelabz.day8;

import java.util.Scanner;

public class Palindrome {
    // Function that returns true if
    public static boolean isPalindrome(String str)
    {

        // Pointers pointing to the beginning
        int i = 0, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String str = sc.next();
        if (isPalindrome(str))
            System.out.print("Yes, its palindrome");
        else
            System.out.print("No,its not palindrome");


    }
}

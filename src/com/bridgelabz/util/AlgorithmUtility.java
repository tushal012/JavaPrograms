package com.bridgelabz.util;

import java.util.Arrays;

public class AlgorithmUtility {
    public final long start;

    /**
     * Purpose: constructor of class
     *
     */
    public AlgorithmUtility() {
        start = System.currentTimeMillis();
    }

    /**
     * Purpose: method for finding two string are anagram or not
     *
     * Identifier: P1AnagramDetection
     *
     * @param str1 input from user
     * @param str2 input from user
     * @return true or false depending upon anagram or not
     */
    public boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        if (str1.length() != str2.length()) {
            return false;
        } else {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Purpose: method for finding prime number or not
     *
     * Identifier: P2PrimeNumber
     *
     * @param num input from user
     * @return returns true if prime else not prime
     */
    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

    /**
     * Purpose: method is check for palindrome number
     *
     * Identifier: P3PrimeAnagram
     *
     * @param num input taken
     * @return return true is num is palindrome else false
     */
    public boolean isPalindrome(int num) {
        int r, sum = 0;
        int temp = num;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum) {
            return true;
        } else {
            return false;
        }
    }


}

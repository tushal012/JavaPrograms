package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {

    static void characterCount(String inputString) {
        HashMap<Character, Integer> charCount= new HashMap<Character, Integer>();

        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {
            if(charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            }

    else{

                charCount.put(c, 1);

            }

        }

        for (Map.Entry entry : charCount.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str =sc.nextLine();
        characterCount(str);

    }
}


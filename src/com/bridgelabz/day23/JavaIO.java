package com.bridgelabz.day23;

import java.io.*;
import java.util.Scanner;

public class JavaIO {
    public static void main(String [ ] args) throws FileNotFoundException {
        new JavaIO().findLongestWords();
    }

    public String findLongestWords() throws FileNotFoundException {

        String longestWord = "";
        String name;
        Scanner sc = new Scanner(new File("D:\\javapractice\\Name.txt"));


        while (sc.hasNext()) {
            name = sc.next();
            if (name.length() > longestWord.length()) {
                longestWord = name;
            }

        }
        System.out.println("\n"+longestWord+"\n");
        return longestWord;
    }
}

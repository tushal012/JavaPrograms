package com.bridgelabz.day24;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        ArrayList<String> str = new ArrayList<>();
        String string = "";
        while((string=br.readLine())!=null){
            string.equals("abc");
            str.add(string);
        }
        br.close();
        Collections.sort(str);
        FileWriter fw = new FileWriter("output.txt");
        for(String s: str){
            fw.write(s);
            fw.write("\r\n");
        }

        fw.close();
    }

}
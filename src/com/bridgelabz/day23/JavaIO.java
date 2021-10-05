package com.bridgelabz.day23;

import java.io.*;

public class JavaIO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Test.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Test.txt"));
        bw.write("Avinash\n");
        bw.write("Atul\n");
        bw.write("Tushal\n");
        bw.write("Sairam\n");

        String name;
        StringBuffer sb = new StringBuffer();
        while ((name = br.readLine()) != null) {
            name = name.replace("Sairam", "monika");
            System.out.println(name);
            sb.append(name);
        }
        br.close();
        bw.write(sb.toString(), 0, sb.length());
        bw.close();

    }
}

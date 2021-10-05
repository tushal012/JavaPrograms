package com.bridgelabz.day23;

import java.io.*;

public class AnimalSound {
    public static void verse(String animal, String noise) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("animal.txt"));
        BufferedReader br = new BufferedReader(new FileReader("animal.txt"));
        bw.write("Old MacDonald had a farm\n");
        bw.write("E-I-E-I-O\n");
        bw.write("And on that farm he had a \n " + animal);
        bw.write("E-I-E-I-O\n");
        bw.write("With a " + noise + "-" + noise + " here\n ");
        bw.write("And a " + noise + "-" + noise + " there\n ");
        bw.write("Here a " + noise + ", there a \n " + noise );
        bw.write( "Everywhere a \n " + noise + "-" + noise );
        bw.write( "Old MacDonald had a farm\n" );
        bw.write( "E-I-E-I-O\n" );

        bw.close();


    }

    public static void main(String[] args) throws IOException {
        verse( "cat" , "meow" );
        verse( "duck" , "quack" );

    }
}

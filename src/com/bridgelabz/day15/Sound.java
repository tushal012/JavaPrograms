package com.bridgelabz.day15;

public class Sound {
    public static void verse(String animal, String noise)
    {
        System.out.println( "Old MacDonald had a farm" );
        System.out.println( "E-I-E-I-O" );
        System.out.println( "And on that farm he had a " + animal );
        System.out.println( "E-I-E-I-O" );
        System.out.println( "With a " + noise + "-" + noise + " here") ;
        System.out.println( "And a " + noise + "-" + noise + " there" );
        System.out.println( "Here a " + noise + ", there a " + noise );
        System.out.println( "Everywhere a " + noise + "-" + noise );
        System.out.println( "Old MacDonald had a farm" );
        System.out.println( "E-I-E-I-O" );
    }

    public static void main(String[] args)
    {
        verse( "cat" , "meow" );
        verse( "duck" , "quack" );
    }
}

package com.bridgelabz.day19;

import java.util.Random;

public class RollDie {
    private  int myRollCount;   // # times rolled
    private int mySides;       // # sides
    private Random myRandom;  // the random number generator


    /**
     * Construct standard six-sided Dice object
     */

    public RollDie()
    {
        this(6);
    }

    /**
     * Constructs a Dice object.
     * @param sides specifies the number of "sides" for the die, e.g.,
     * 2 is a coin, 6 is a "regular" die.
     */
    public RollDie(int sides)
    {
        myRollCount = 0;
        mySides = sides;
        myRandom = new Random();
    }

    /**
     * Returns the random "roll" of the die, a uniformly distributed
     * random number in the range [1..numSides()].
     * @return a random value in range [1..numSides()]
     */
    public int roll()
    {
        myRollCount++;
        return myRandom.nextInt(mySides) + 1;
    }

    /*
     * Returns number of sides of die
     * @return number of sides of this dice object
     */

    public int numSides()
    {
        return mySides;
    }

    /*
     * Returns number of times this die object has been rolled.
     * @return number of times dice object rolled
     */

    public int numRolls()
    {
        return myRollCount;
    }

    /**
     * Returns a string representing this Dice object
     */

    public String toString()
    {
        return "# sides: " + numSides() + " # rolls: " + numRolls();
    }

    public static void main(String[] args)
    {
        RollDie die = new RollDie(6);

        for(int k = 0; k < 7; k++)
        {
            int roll = die.roll();
            System.out.println("roll " + die.numRolls() + ": " + roll);
        }
        
    }

}

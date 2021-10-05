package com.bridgelabz.day20;

import com.bridgelabz.util.Utility;


public class GamlingSimulator {
    public static void main(String[] args)
    {
    Utility u=new Utility();
		System.out.println("Enter $Stake value: ");
    int $Stake=u.inputInteger();
		System.out.println("Enter $Goal value: ");
    int $Goal=u.inputInteger();
		System.out.println("Enter number of times: ");
    int noOfTimes=u.inputInteger();

    int bets = 0;        // total number of bets made
    int wins = 0;        // total number of games won

    // repeat number of times
		for (int i=0; i< noOfTimes; i++)
    {
        int cash = $Stake;

        while (cash > 0 && cash < $Goal)
        {
            bets++;

            if (Math.random() < 0.5)
                cash++;     // win $1
            else
                cash--;     // lose $1
        }
        if (cash == $Goal)
            wins++;                // to find no. of wins
    }

    // print results
		System.out.println();
		System.out.println(wins + " wins of " + noOfTimes);
		System.out.println("Percent of games won = " + 100.0 * wins / noOfTimes);
		System.out.println("Avg # bets           = " + 1.0 * bets / noOfTimes);
}
}

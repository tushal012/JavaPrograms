package com.bridgelabz.day24;

public class Sorting {
    public static void main (String[] args)
    {
        Integer arr[] = {10, 22, 1, 6, 8, 78, 56, 66, 2, 1};
        BubbleSorting.bubbleSorting(arr, arr.length);

        String[] strArr = {"Tushal", "Avinash", "Sameer", "Pampapati"};
        BubbleSorting.bubbleSorting(strArr, arr.length);

        System.out.println("Sorted Array: ");
        for(Integer i : arr)
        {
            System.out.println(i);
        }

        System.out.println("Sorted String : ");
        for(String i :strArr){
            System.out.println(i);
        }
    }
}

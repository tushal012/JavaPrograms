package com.bridgelabz.day14;

import com.bridgelabz.util.Utility;

public class BubbleSort {
    public static void main(String[] args) {
        int i,j,temp=0;
        Utility u=new Utility();
        System.out.println("Enter how many numbers to be sorted:");
        int n=u.inputInteger();
        int a[]=new int[n];
        System.out.println();
        System.out.println("Enter value for "+n+" numbers:");

        for(i=0;i<a.length;i++)
        {
            a[i]=u.inputInteger();		//taking input from user
        }

        for(i=0;i<a.length;i++)         //sorting the array
        {
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("The sorted order is:");

        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);		//printing the sorted array
        }

    }
}

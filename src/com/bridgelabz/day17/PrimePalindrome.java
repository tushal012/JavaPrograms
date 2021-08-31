package com.bridgelabz.day17;

import java.util.Scanner;

public class PrimePalindrome {
    int m,n,rev,c;

    //function to take input
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial number: ");
        m=sc.nextInt();
        System.out.println("Enter the last number: ");
        n=sc.nextInt();
    }

    //function to find prime palindrome
    void primePalin()
    {
     int num,temp,i;
        System.out.println("The prime palindrome number are : ");
        for(num=m;num<=n;num++){
            c=0;
            rev=0;
            temp=num;
            //checking for prime number
            for(i=1;i<=temp;i++){
                //counting the number of factors of the number
                if(temp%i==0)
                    c++;
            }
            //if the number is prime check for palindrome
            if(c==2){
                //reversing the number
                while(temp>0){
                    rev=rev*10+(temp%10);
                    temp=temp/10;
                }
                //checking for the prime palindrome number
                if(rev==num)
                    System.out.println(num+" ");
            }
        }
    }
    //main function
    public static void main(String[] args) {
        //creating an object
        PrimePalindrome p = new PrimePalindrome();
        //calling the function
        p.accept();
        p.primePalin();
    }
}




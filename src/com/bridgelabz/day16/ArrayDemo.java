package com.bridgelabz.day16;

import com.bridgelabz.util.Utility;

import java.io.PrintWriter;

public class ArrayDemo {
    public static void main(String[] args) {

        Utility u=new Utility();
        System.out.println("Enter number of rows: ");
        int m = u.inputInteger();
        System.out.println("Enter number of columns: ");
        int n = u.inputInteger();

        //calling methods
        int [][] a  =arrayInt(m,n);
        double [][] b  =arrayDouble(m,n);
        String [][] c  =arrayBoolean(m,n);

        //calling display method
        display(a,b,c,m,n);

    }

    public static int[][] arrayInt(int m,int n)
    {
        int a[][]=new int[m][n];
        Utility u=new Utility();
        System.out.println();
        System.out.println("Integer Array");

        for(int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                a[i][j] = u.inputInteger();
            }
        }
        return a;
    }

    public static double[][] arrayDouble(int m,int n)
    {
        double b[][]=new double[m][n];
        Utility u=new Utility();
        System.out.println();
        System.out.println("Double Array");

        for(int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                b[i][j] = u.inputDouble();
            }
        }
        return b;
    }

    public static String[][] arrayBoolean(int m,int n)
    {
        String c[][]=new String[m][n];
        Utility u=new Utility();
        System.out.println();
        System.out.println("Boolean Array");

        for(int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                c[i][j] = u.inputString();
            }
        }
        return c;
    }

    //display method
    public static void display(int[][]a,double[][]b,String[][]c,int m,int n)
    {
        PrintWriter pw=new PrintWriter(System.out,true);

        //display integers
        System.out.println();
        pw.println("2D ARRAY INTEGER");

        for(int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                pw.print("\t"+a[i][j]+" ");
            }
            pw.println("\t");
        }


        //display double
        System.out.println();
        pw.println("2D ARRAY DOUBLE");

        for(int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                pw.print("\t"+b[i][j]+" ");
            }
            pw.println("\t");
        }

        //display boolean
        System.out.println();
        pw.println("2D ARRAY BOOLEAN");

        for(int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                pw.print("\t"+c[i][j]+" ");
            }
            pw.println("\t");
        }
    }
}

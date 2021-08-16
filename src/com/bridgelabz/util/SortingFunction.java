package com.bridgelabz.util;

import java.util.StringTokenizer;

public class SortingFunction {

    Utility u=new Utility();
    StringTokenizer st;

    public SortingFunction(){
    }

    //Take 1D Array Input
    public int[] input1DArray(int arraySize){
        int array[]=new int[arraySize];
        for(int i=0;i<arraySize;i++){
            System.out.println("Enter array["+i+"] : ");
            array[i]=u.inputInteger();
        }
        return array;
    }
    //Print 1D array
    public void print1DArray(int array[]){
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }

    //print 1D array String
    public void print1DStringArray(String array[]){
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }

    //Binary Search
    public int binarySearch(int[] inputArr, int key) {
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    //Binary Search for String
    public int binarySearchString(String[] names, String key) {
        int first = 0;
        int last  = names.length;

        while (first < last) {
            int mid = (first + last) / 2;
            if (key.compareTo(names[mid]) < 0) {
                last = mid;
            } else if (key.compareTo(names[mid]) > 0) {
                first = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public String[] input1DStringArray(int arraySize){
        String array[]=new String[arraySize];
        for(int i=0;i<arraySize;i++){
            System.out.println("Enter array["+i+"] : ");
            array[i]=u.inputString();
        }
        return array;
    }

}

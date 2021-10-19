package com.bridgelabz.day24;



public class BubbleSorting {
    public static <T extends Comparable<T>> void bubbleSorting (T[] array, int size)
    {
        T temp;
        for(int i = array.length; i > 1; i--){
            for(int j = 0; j < i - 1; j++){
                //if greater swap elements
                if(array[j].compareTo(array[j+1]) > 0){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }


}

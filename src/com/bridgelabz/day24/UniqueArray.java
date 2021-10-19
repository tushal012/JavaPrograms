package com.bridgelabz.day24;

public class UniqueArray {
    static void print(int arr[],int n)
    {
        for (int i = 0;i < n;i++){
            int a = 1;
            for(int j = 0; j<n;j++) {
                if (i == j) {
                    continue;
                }
                if(arr[i] == arr[j]){
                    a = 0;
                    break;
                }
            }
            if (a != 0) {
               System.out.println(arr[i]);
            }

        }
    }

    public static void main(String[] args) {
        int arr [] = {4,2,1,3,5,4,1,5};
        int n = arr.length;
        print(arr, n);
    }
}

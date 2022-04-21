package com.company;

public class shoting_array
{

    public static void main(String[] args) {

        int [] arr = {1, 21, 3, 4, 5, 34,43,56,45, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp

            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }
    }
}

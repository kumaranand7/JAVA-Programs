package com.company.Hunter.Recursion;

public class ReverseArray {

    static void reverse(int[] arr, int start, int end){

        if(start>=end)
            return;

        //swap
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        //recursive call
         reverse(arr,start+1, end-1);

    }
    public static void main(String[] args) {

        int arr[]={2,3,4,56};
        int start=0;
        int end= arr.length-1;

        reverse(arr, start, end);

        for (int element: arr){
            System.out.println(element);
        }
    }
}

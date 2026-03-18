package com.company.Hunter.ArrayPrg;

public class ArrayLeftRotateByOne {
    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 4, 5, 6};
        // Store the first element in a temporary variable
        int temp  = arr[0];

        // Shift elements to the left
        for(int i = 1; i < arr.length; i++){
            arr[i-1]=arr[i];
        }

        // Place the first element at the end
        arr[arr.length - 1] = temp ;

        for (int element: arr )
            System.out.print(element+  " ");

    }
}
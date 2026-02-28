package com.company.Hunter.ArrayPrg;

public class SecondLargest {

    public static int largest(int arr []){
        int max_element= Integer.MIN_VALUE;

        for(int element: arr){
            if(element>max_element){
                max_element=element;
            }
        }
        return max_element;
    }

    public static int SecondMax(int arr[], int max){
        int secondmax_element= Integer.MIN_VALUE;

        for(int element: arr){
            if(element>secondmax_element && element<max){
                secondmax_element=element;
            }
        }

        if(secondmax_element == Integer.MIN_VALUE){
            System.out.println("Second largest element does not exist");
            return -1;   // case when {8,8,8} so that it do not return MIN_VALUE
        }
        return secondmax_element;
    }


    public static void main(String[] args) {
        int arr[]= {8};

        int n=arr.length;
        if (n<2) {
            System.out.println("Array has less than 2 element");
        }

        int max=largest(arr);

        System.out.println("max element is "+max);

        int secondmax=SecondMax(arr, max);

        if(secondmax != -1){
            System.out.println("second max element is " + secondmax);
        }


    }
}

//////////////////////////Optimal Approach///////////////////////////////
/*
public class SecondLargest {

    public static void main(String[] args) {

        int arr[] = {4, 7, 5, 8};

        int max = arr[0];
        int secondMax = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Max element is " + max);
        System.out.println("Second max element is " + secondMax);
    }
}

*/

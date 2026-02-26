package com.company.Hunter.Sorting1;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]= {7,4,5,8,9,9,3};

        for(int i=0; i< arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){

                if(arr[i]>arr[j]){
                    //swap
                    int tmp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=tmp;
                }

        }
        }
        for(int element :arr){
        System.out.println(element);

        }
    }
}

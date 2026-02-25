package com.company.Hunter.Sorting1;

public class BubbleSort {
    public static void main(String[] args) {

        int arr[]={7,4,5,8,9,9,3,4};
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){ //  n-1-i; last sprted element skip in each pass
                if(arr[j]>arr[j+1]){
                    //swap
                    int tmp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        for(int element: arr){
            System.out.print(element + " ");
        }
    }
}

//T O(n2)
// S O(1)
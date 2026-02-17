package com.company.Hunter.Sorting1;

public class SelectionSortOptimised {

    public static void main(String[] args) {

        int arr[]={8,5,4,3,2,4,6};

        int n=arr.length;

        for(int i =0; i<n-1; i++){
            int index=i;
            for(int j =i+1; j<n; j++) {
                if(arr[j] < arr[index]) {
                    index= j;
                }

            }
            if (  index != i) { 
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }

        }
        //printing array elements 

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ ", ");
        }


    }
}

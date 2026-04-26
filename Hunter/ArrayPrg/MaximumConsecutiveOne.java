package com.company.Hunter.ArrayPrg;

public class MaximumConsecutiveOne {

    public static void main(String[] args) {

        int arr[]={1, 1, 0, 1, 1, 1};

        int max=0;
        int count=0;

        for(int i =0; i<arr.length; i++){
            if(arr[i]==1){
                count++;
            }
            else {
                max = Math.max(max, count);
                count = 0;
            }
        }

        max = Math.max(max, count); // To update max: required in case when there is no zero {1, 1, 1, 1};

        System.out.println(max);

    }
}

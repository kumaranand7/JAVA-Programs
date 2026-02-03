package com.company.Hunter.SlidingWindow;

public class SumOf3Window {

    static void SumOfKSlinding(int arr[], int k){

        //Pring sum of fist slide

        int sum=0;
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }
        System.out.println(sum);

        for(int i=k; i< arr.length; i++){
            sum= sum + arr[i] -arr[i-k];
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        int arr[]={ 2, 1, 5, 1, 3, 2};
        int windowsize=3; //Brute force... what is k=4? then harcode value should be changes
        //better appoch is using sliding window

//        for(int i=0; i<= arr.length-windowsize; i++){
//            int j=i+1;
//            int k=i+2;
//            int sum =arr[i]+arr[j]+arr[k];
//            System.out.println(sum);
//        }

        SumOfKSlinding(arr, windowsize);
    }




}

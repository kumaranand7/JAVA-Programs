package com.company.Hunter.SlidingWindow;
/*arr = [2, 1, 5, 1, 3, 2]
k = 3
O/P 9
       as [5, 1, 3] ka sum = 9
MAx sum of subarray

 */
public class MaxSumOfWindowK {

    static void maxSum(int arr[], int k){
        int windowSum=0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int max=windowSum;

        for(int i=k; i< arr.length; i++){
            windowSum = windowSum + arr[i] - arr[i - k];
            max = Math.max(max, windowSum);
        }

        System.out.println(max);


    }
    public static void main(String[] args) {
        int arr[] ={2, 1, 5, 1, 3, 2};
        int k =3;
        maxSum(arr, k);

    }
}

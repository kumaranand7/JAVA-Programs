package com.company.Hunter.BinarySearch;
//Example 1:
//Input Format: N = 4, arr[] = {1,2,2,3}, x = 2
//Result: 1
//Explanation: Index 1 is the smallest index such that arr[1] >= x.

public class LowerBound {

    public int  checkLowerBound(int arr[], int N, int x){
        for(int i=0; i<N; i++){
            if(arr[i]>=x) {
               return i;
            }
        }
        return arr.length;  // If x is greater than all elements
    }
    public static void main(String[] args) {
        int arr[] = {3,5,8,15,19};
        int N=5;
        int x=9;

        LowerBound obj=new LowerBound();
        int lb =obj.checkLowerBound(arr, N, x);
        System.out.println(lb); //op 3

    }
}
//Time Complexity: O(N), where N = size of the given array.
//Space Complexity: O(1), no extra space used.


//Optimal approch can binary search:
//Complexity Analysis
//Time Complexity: O(logn), used for typical binary search
//Space Complexity: O(1), no extra space used
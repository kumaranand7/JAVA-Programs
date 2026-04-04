package com.company.Hunter.ArrayPrg;

public class MoveAllZerosToEnd {

    public static int[] movezero(int arr[]) {
        int tmp[] = new int[arr.length];
        int idx = 0;

        for (int element : arr) {
            if (element != 0) {
                tmp[idx] = element;
                idx++;
            }
        }

        return tmp;
    }

    public static void main(String[] args) {

        int arr[] = {1, 0, 2, 3, 0, 4, 0, 1};
        int result[] = movezero(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}


//Time Complexity: O(N), we can move all zeroes to end in linear time.
//Space Complexity: O(N), additional space used for temporary array.
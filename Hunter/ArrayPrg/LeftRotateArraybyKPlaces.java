package com.company.Hunter.ArrayPrg;


import java.util.Scanner;

class Solution {
    public void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // handle k > n

        // Step 1: store first k elements
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }

        // Step 2: shift remaining elements
        for (int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }

        // Step 3: put temp at the end
        for (int i = 0; i < k; i++) {
            nums[n - k + i] = temp[i];
        }
    }
}

public class LeftRotateArraybyKPlaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        // Rotate array
        Solution obj = new Solution();
        obj.rotateArray(nums, k);

        // Output result
        System.out.println("Rotated array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
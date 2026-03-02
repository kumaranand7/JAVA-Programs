package com.company.Hunter.Leetcode;


public class SortedRotated {
    public boolean check(int[] nums) {

        int n = nums.length;   // Store the length of the array
        int count = 0;         // This will count how many times the order breaks

        // Traverse the entire array
        for (int i = 0; i < n; i++) {

            // Compare current element with the next element
            // (i + 1) % n makes the array circular
            // so that the last element compares with the first
            if (nums[i] > nums[(i + 1) % n]) {
                count++;  // Increase count if we find a decreasing pair
            }
        }

        // If the order breaks more than once,
        // the array cannot be sorted and rotated
        // Valid cases: 0 or 1 break
        return count <= 1;
    }
}
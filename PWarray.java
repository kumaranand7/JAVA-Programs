package com.company;
public class PWarray
{
    public static void main(String[] args) {
        int max = 0;
        int i;
        int arr[] = {2, 345, 45, 23, 3, 4};
        for ( i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
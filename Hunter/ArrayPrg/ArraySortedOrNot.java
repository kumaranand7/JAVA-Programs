package com.company.Hunter.ArrayPrg;

public class ArraySortedOrNot {

    public boolean isSorted(int arr[]){

        for(int i =1; i< arr.length; i++){
            if (arr[i]<arr[i-1])
            return false;  // If any element is smaller than the previous one, return false
        }
        return true;
    }
    public static void main(String[] args) {

        int arr[]={11,22,34,45,77};
        ArraySortedOrNot obj= new ArraySortedOrNot();

        obj.isSorted(arr);
        System.out.println(obj.isSorted(arr) ? "True" : "False");
    }
}

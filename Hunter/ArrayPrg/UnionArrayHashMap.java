package com.company.Hunter.ArrayPrg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class UnionArrayHashMap {
    public static void main(String[] args) {
        int n= 5,m=5;
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,3,4,4,5};
                                    //o/p : [1, 2, 3, 4, 5]

        HashMap<Integer, Integer> h1= new HashMap<>();

        //add arr1 in map
        for(int element: arr1){
            h1.put(element,1);
        }
        //add arr2 in map
        for(int element: arr2){
            h1.put(element,1);
        }
        //add keys into list
        ArrayList<Integer> l1 = new ArrayList<>(h1.keySet());

        System.out.println(l1);

        //we can also used TreeSet = Sorted + Unique elements collection
/*
        Set<Integer> st = new TreeSet<>();

        // Insert elements from first array
        for (int num : arr1) {
            st.add(num);
        }

        // Insert elements from second array
        for (int num : arr2) {
            st.add(num);
        }

        System.out.println(st);

        */
    }
}

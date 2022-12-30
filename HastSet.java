package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class HastSet {


    public static void main(String[] args) {

        HashSet <Integer> l1= new HashSet<>();



        l1.clear();  //clear all element
        l1.add(5);  // add element in hashset
        l1.add(3);
        l1.add(3);
        l1.add(2);

        System.out.println(l1);
    }
}

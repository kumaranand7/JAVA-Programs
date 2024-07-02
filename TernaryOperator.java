package com.company;

public class TernaryOperator {

    public static void main(String[] args) {

        int a=5,b=7,c=100;

        int temp=a>b?a:b; 

        int result=temp>c?temp:c;
        System.out.println(result+" is greater element ");
    }
}

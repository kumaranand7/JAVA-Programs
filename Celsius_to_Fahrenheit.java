package com.company;

import java.util.Scanner;

public class Celsius_to_Fahrenheit {

 
    static int clTof(int a)
    {

        return    ((a*9)/5)+32;

    }

    public static void main(String[] args) {

        Scanner yo=new Scanner(System.in);
        System.out.println("Enter Celsius :");
        int c= yo.nextInt();
       int result= clTof(c);
        System.out.println(result);
    }
}

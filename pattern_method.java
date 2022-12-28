//pattern problem using method
//        *
//
//        **
//
//        ***
//
//        ****
//
//        *****


package com.company;

import java.util.Scanner;

public class pattern_method {


    static void pattern(int n){

        for (int i=0; i<n; i++)
        {
            for (int j=0; j<i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }

    }



    public static void main(String[] args) {
        System.out.println("enter any no. ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        pattern(x);
    }
 
}

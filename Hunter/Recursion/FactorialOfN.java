package com.company.Hunter.Recursion;

import java.util.Scanner;

public class FactorialOfN {
    static int fact(int n){
        if (n<=1)
                return n;

        return  n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int N= sc.nextInt();
        System.out.println(fact( N));

    }
}

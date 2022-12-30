//fibonacci series   0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …….. ...


package com.company;

import java.util.Scanner;

public class fibonacci_series {


    public static int fibonacci(int n ){

        if(n==1 || n==2 )
        {

            return n-1;
        }
        else
        {
            return fibonacci(n-1)+fibonacci(n-2);
        }

    }

    public static void main(String[] args) {

        System.out.println("Enter the value of n: ");
        Scanner anand=new Scanner(System.in);
        int x= anand.nextInt();

        int result=fibonacci(x);
        System.out.println(result);
    }
}

package com.company;

import java.util.Scanner;

public class sum_of_N_natural_no_recursive {


    static int sum(int n)
    {
        if (n==1)
        {

            return 1;

        } else
            return n + sum(n - 1);

    }



    public static void main(String[] args)
    {
        System.out.println("enter any no. ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        sum(x);
        System.out.println("sum is= "+sum(x));
    }


}

package com.company;

import java.util.Scanner;

public class table_method {

     static int table(int n)
    {

       for (int i=1; i<=10; i++)
       {
           System.out.printf("%d * %d = %d \n",n,i,n*i);
       }

return 0;
    }

    public static void main(String[] args) {
        System.out.println("enter any no. to get table: ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        table(x);

    }

}

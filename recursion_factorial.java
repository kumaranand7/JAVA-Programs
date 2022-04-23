//
// factorial of a number using recursion
//
//

package com.company;

public class recursion_factorial {

    public static int factorial(int n)
    {

        if(n==0 || n==1){
           return 1;
        }
        else
        {
                        //n*(n-1)*(n-2)....
                        //n*factorial(n-1)
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int x=5;
        System.out.println("factorial is "+ factorial(x));
    }

}

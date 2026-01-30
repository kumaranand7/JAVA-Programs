package com.company.Hunter.Recursion;

public class SumofNNumbers {
    static int SumN(int N ){
        if(N==1)
            return 1;
        return N+ SumN(N-1);
    }
    public static void main(String[] args) {

        int N=5;
        System.out.println("Sum is: "+SumN(N));
    }
}

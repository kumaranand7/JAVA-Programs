package com.company.Hunter.Recursion;

public class Print1ToN {
    static void printNumber(int N,int count){
        if(count>N)
            return;
        System.out.println(count);
        printNumber(N,count+1);
    }
    public static void main(String[] args) {
        int N=5;
        printNumber(N,1);
    }
}

//Time Complexity: O(N), we print every number from 1 to N using recursion
//Space Complexity: O(N), stack space used for recursive calls.

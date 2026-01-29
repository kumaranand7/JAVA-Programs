package com.company.Hunter.Recursion;

public class PrintNto1 {
    static  void PrintNumber(int count ){

        if(count<1)
            return;
        System.out.println(count);
        PrintNumber(count-1);
    }
    public static void main(String[] args) {
        int N =5;
        PrintNumber( N);
    }
}

//Time Complexity: O(N), we print every number from N to 1 using recursion
//Space Complexity: O(N), stack space used for recursive calls.

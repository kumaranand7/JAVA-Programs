package com.company.Hunter.BitManipulation;

import java.sql.SQLOutput;

public class BitManipulate {

    boolean isKthBitSet(int n, int k) {     //if kth bit is set to 1

        int result = n & (1 << k) ;
        if (result != 0)
            return true;
        else
            return false;

        //return (n & (1 << k)) != 0; shortcut
    }


    boolean isEven(int n){

        //int res = n & (1 << 0);  this can be simplified as below

        //int res = n & 1;
        //return (res==0) ;   //this can be more simplified as below

        return (n & 1) == 0;
    }


    boolean isPowerOfTwo(int n){
        if(n > 0 && (n & (n-1)) == 0)     //  4 & 3 ==0 return true
            return  true;
        else
            return false;
    }
    public static void main(String[] args) {

        BitManipulate b1 = new BitManipulate();
        System.out.println(b1.isKthBitSet(13,3)); //1101  //op true


        System.out.println(b1.isEven(5));
        System.out.println(b1.isEven(50));

        System.out.println("check if power of two");
        System.out.println(b1.isPowerOfTwo(8));
        System.out.println(b1.isPowerOfTwo(81));

    }
}

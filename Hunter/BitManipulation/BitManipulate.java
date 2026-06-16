package com.company.Hunter.BitManipulation;
public class BitManipulate {

    boolean isKthBitSet(int n, int k) {
        int result = n & (1 << k) ;
        if (result != 0)
            return true;
        else
            return false;

        //return (n & (1 << k)) != 0; shortcut
    }

    public static void main(String[] args) {

        BitManipulate b1 = new BitManipulate();
        System.out.println(b1.isKthBitSet(13,3)); //1101  //op true

    }
}

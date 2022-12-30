package com.company;
import java.lang.String;

public class string_reverse {
    public static void main(String[] args) {
        String str="Anand";
        char[] str1 = str.toCharArray();
        System.out.println(str1[2]);
        for (int i = str1.length - 1; i >= 0; i--)
        {
            System.out.print(str1[i]);
        }
    }
}




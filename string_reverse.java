package com.company;
import java.lang.String;

public class string_reverse {

    public  static  String reverseString(String str){

        String rev="";

        for(int i=str.length()-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }
        return  rev;
    }

    //t: O(N^2) har iteration pr rev ka size chanhe ho rha (due to IMMUTABLE) 1 char, 2 char, 3 char....n char = 1+2+3+4+....N= N*(N+1)/2) =o(N^2)
    //S: O(N^2)


    public static void main(String[] args) {
        String str="Anand";
        char[] str1 = str.toCharArray();
        System.out.println(str1[2]);
        for (int i = str1.length - 1; i >= 0; i--)
        {
            System.out.print(str1[i]);
        }


        System.out.print('\n');
        String str2="aNAND";

        System.out.print(reverseString(str2));


       // other approch
//        Using StringBuilder.reverse() or StringBuffer  //Efficient and concise with built-in reverse() methods
//        Using Character Array  //When working with individual characters or for manual control.
//        Using Collections.reverse() //When already working with lists or collections.
//        Using a Stack //When following the LIFO principle or using stacks in the algorithm.


    }




}




package com.company.Hunter.StringPrg;

import java.util.Arrays;
import java.util.Scanner;

//Input: CAT, ACT
//Output: true

public class AnagramString {

    public static boolean checkAnagram(String str1, String str2){

        if (str1.length()!=str2.length()) return  false;

        char ch1[]= str1.toLowerCase().toCharArray();
        char ch2[]= str2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

//        return  ch1.equals(ch2); Reference comparison (wrong)
        return  Arrays.equals(ch1,ch2); //Content comparison

    }
    public static void main(String[] args) {

        System.out.println("Enter first string");
        Scanner sc = new Scanner(System.in);
        String str1= sc.nextLine();

        System.out.println("Enter second string");
        String str2= sc.nextLine();

        System.out.println("Checking....");

        boolean isAnagram = checkAnagram(str1,str2);

        System.out.println(isAnagram ? "String is Anagram" : "String is not anagram");

    }
}

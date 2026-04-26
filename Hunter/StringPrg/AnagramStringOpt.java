package com.company.Hunter.StringPrg;

import java.util.Scanner;


//First, check if the lengths of both strings are equal. If not, return false immediately as they cannot be anagrams.
//Initialize a frequency array of size 26 (for all uppercase English letters) and set all elements to 0.
//Traverse the first string and increment the frequency of each character.
//Traverse the second string and decrement the frequency of each character.
//Finally, check if all elements in the frequency array are zero. If any element is not zero, return false as the characters do not match in frequency.
//If all frequencies are zero, the strings are anagrams and the function returns true.
public class AnagramStringOpt {
        public static void main(String[] args) {

        System.out.println("Enter first string");
        Scanner sc = new Scanner(System.in);
        String str1= sc.nextLine();

        System.out.println("Enter second string");
        String str2= sc.nextLine();

        System.out.println("Checking....");
        int freq[] = new int[26];

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() != str2.length()){
            System.out.println("not anagram");
            return;
        }

        for(int i = 0; i < str1.length(); i++){
            int index = str1.charAt(i) - 'a';
            freq[index]++;
        }

        for(int i = 0; i < str2.length(); i++){
            int index = str2.charAt(i) - 'a';
            freq[index]--;
        }

        for(int element : freq){
            if(element != 0){
                System.out.println("not anagram");
                return;
            }
        }

        System.out.println("anagram");
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
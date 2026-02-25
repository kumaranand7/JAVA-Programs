package com.company.Hunter.Leetcode;

import java.util.Arrays;

public class CheckAnagram {

    public boolean isAnagram(String s,String t){

        if(s.length()!=t.length())
            return false;

        char [] Sh=s.toCharArray();
        char [] Th=t.toCharArray();

        Arrays.sort(Sh); 
        Arrays.sort(Th);

        return Arrays.equals(Sh,Th);
    }
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        CheckAnagram obj = new CheckAnagram();
        Boolean res=obj.isAnagram( s, t);
        System.out.println(res);
    }
}

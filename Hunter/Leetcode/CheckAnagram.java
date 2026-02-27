package com.company.Hunter.Leetcode;

import java.util.Arrays;

public class CheckAnagram {

    public boolean isAnagram(String s,String t){

        char [] Sh=s.trim().toCharArray();
        char [] Th=t.trim().toCharArray();

        if(Sh.length!=Th.length)
            return false;

        Arrays.sort(Sh); 
        Arrays.sort(Th);

        return Arrays.equals(Sh,Th);
    }
    public static void main(String[] args) {
        String s=" anagram ";
        String t="nagaram ";
        CheckAnagram obj = new CheckAnagram();
        Boolean res=obj.isAnagram( s, t);
        System.out.println(res);

    }
}

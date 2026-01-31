package com.company.Hunter.Recursion;

public class PalindromString {
    static boolean checkPalindrom(String str){
        str=str.toUpperCase();
     String originalString= str;

     int start =0;
     int end=str.length()-1;
     char [] strArr=str.toCharArray();

      while(start<end){
          char tmp = strArr[start];
          strArr[start]=strArr[end];
          strArr[end]=tmp;
          start++;
          end--;
      }

      //String rev =  strArr.toString();
         String rev = new String(strArr);

      return  rev.equals(originalString);

    }
    //recursion
    static boolean checkPalindromeRec(String str, int start, int end) {

        // base case
        if (start >= end) {
            return true;
        }

        // mismatch case
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // recursive call
        return checkPalindromeRec(str, start + 1, end - 1);
    }
    public static void main(String[] args) {
       // String str ="MadaM";
        //System.out.println(checkPalindrom(str));

        String str = "MadaM".toUpperCase();
        boolean ans = checkPalindromeRec(str, 0, str.length() - 1);
        System.out.println(ans);

    }
}

//Time complexity is O(n) since each character is checked once,
//and space complexity is O(n) due to recursive call stack

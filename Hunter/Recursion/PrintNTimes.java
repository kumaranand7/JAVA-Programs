package com.company.Hunter.Recursion;
//print Hunter N times
public  class PrintNTimes {
    static void PrintHunter(int n, String Str){

         if (n==0){
//           System.out.println("Hunter");
             return;
         }

         PrintHunter(n-1, Str);
         System.out.println(Str + n);

    }
    public static void main(String[] args) {

        int n=5;
        String str="Hunter";
        PrintHunter(n, str);

    }


}

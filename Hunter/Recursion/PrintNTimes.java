package com.company.Hunter.Recursion;
//print Hunter N times
public class PrintNTimes {


     void PrintHunter(int n, String Str){

         if (n==0){
//           System.out.println("Hunter");
             return;
         }

         PrintHunter(n-1, Str);
         System.out.println(Str);

    }




    public static void main(String[] args) {

        int n=5;
        String str="Hunter";

        PrintNTimes obj = new PrintNTimes();

        obj.PrintHunter(n, str);

    }


}

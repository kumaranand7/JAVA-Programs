package com.company;
public class binary_to_decimal {
    public static void main(String[] args) {
int n=1001;
int  ans=0;
int pw=1;

// binary to decimal

while (n>0){
           int untit_place= n%2;
           ans=ans+(untit_place*pw);
           n=n/10;
           pw=pw*2;
        }
        System.out.println(ans);
    }

}


// deciaml to binary
//        while (n>0)
//        {
//            int untit_place= n%2;
//            ans=ans+(untit_place*pw);
//            pw=pw*10;
//            n=n/2;
//        }
//        System.out.println(ans);
//    }
//
//}
package com.company;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 701;
        int c = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }

        if (c == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
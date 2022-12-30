package com.company;

public class pw_linearSearch
{
    public static void main(String[] args)
    {
        int x=32;
        int arr[]={3,4,32,7,44,3,64,3,1};
        for (int i=0; i<arr.length; i++){
            if (arr[i]==x){
                System.out.println("element "+x+" is at position "+ i );
            }
        }
    }
}

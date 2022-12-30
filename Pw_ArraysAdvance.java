package com.company;

class ArrCount
{   int x=5;
    int c=0;
    void ArrayCount(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == x)
            {
                c++;
            }

        }
        System.out.println(c+"\n");

    }
}

public class Pw_ArraysAdvance {
    public static void main(String[] args) {
        int []arr2={3,4,5,3};
        ArrCount obj2=new ArrCount();
        obj2.ArrayCount(arr2);


        int []arr1={3,4,5,3,5,7,5};
        ArrCount obj=new ArrCount();
        obj.ArrayCount(arr1);

        int []arr3=arr2.clone();  // deep copy
        int []arr4=arr2;  // shallow copy



    }


}

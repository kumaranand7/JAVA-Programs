package com.company.Hunter.Hashing;

import java.util.HashMap;
import java.util.Map;

public class FreqCount {

    public static void main(String[] args) {

        int arr[]={2,3,5,3,2,3,5,3,2,3};

        HashMap <Integer, Integer> map = new HashMap<>();

        for (int element: arr){
            if (map.containsKey(element))
            map.put(element,map.get(element)+1);  //If key exists, increment; else initialize with 1
            else
                map.put(element,1);
        }

//        for (int element : arr) {
//            map.put(element, map.getOrDefault(element, 0) + 1);
//        }

        for (HashMap.Entry <Integer,Integer> entry: map.entrySet() ){
            System.out.println(entry.getKey()+ "-->"+ entry.getValue());
        }
       // System.out.println(map); //{2=3, 3=5, 5=2}
    }
}

//Time Complexity: O(N), where N is the number of elements in the array. Each element is processed once.
//
//Space Complexity: O(N), for storing frequencies of unique elements in the unordered_map.

package com.company.Hunter.Hashing;

import java.util.HashMap;
import java.util.Map;

public class MaxMinFreq {

  public   static  void maxFreq(int arr[],int size){
      HashMap<Integer,Integer> map = new HashMap<>();


      for (int element: arr){
          map.put(element, map.getOrDefault(element,0)+1);
      }

//      System.out.println(map);
      int maxelement=0;
      int minelement=0;
      int maxfreq=0;
      int minfreq=size;

      for(Map.Entry <Integer,Integer> entry: map.entrySet()){
          int element=entry.getKey();
          int count=entry.getValue();

          if(count>maxfreq){
              maxelement=element;
              maxfreq=count;
          }

          if(count<minfreq){
              minelement=element;
              minfreq=count;
          }

      }

      System.out.println("max "+ maxelement + " Freq ==> "+ maxfreq );
      System.out.println("min "+ minelement + " Freq ==> "+ minfreq );
    }

    public static void main(String[] args) {
        int arr[]={2,3,2,2,3,2,2,5,5,8};
        maxFreq(arr, arr.length);
    }


}

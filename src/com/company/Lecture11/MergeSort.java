package com.company.Lecture11;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[]nums={2,5,3,6};
      int res[]=  mergesort(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] mergesort(int[]nums){
        if (nums.length < 2) {
            return  nums;
        }
        int mid=nums.length/2;
        int[] first=new int[mid];
        for (int i = 0; i <mid ; i++) {
            first[i]=nums[i];
        }
        int[] second=new int[nums.length-mid];
        for (int i = 0; i <second.length ; i++) {
            second[i]=nums[i+mid];
        }
//        int[] first = Arrays.copyOfRange(nums,0,mid);
//        int[] second=Arrays.copyOfRange(nums,mid,nums.length);
        first=mergesort(first);
        second=mergesort(second);
        return merge(first,second);
    }
    private static  int[] merge(int[] first,int[] second){
        int[] res=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<first.length && j<second.length){
            if(first[i]<second[j]){
                res[k++]=first[i++];
            }else{
                res[k++]=second[j++];
            }

        }
        while(i<first.length){
            res[k++]=first[i++];
        }
        while(j<second.length){
            res[k++]=second[j++];
        }
        return res;
    }
}

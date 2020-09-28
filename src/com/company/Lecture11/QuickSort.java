package com.company.Lecture11;

import com.company.Lecture5.Arrayintro;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums={34,45,56,46,57,36};
        quicksort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void quicksort(int[] nums, int start, int end){
        if (start>=end){
            return;
        }
        int p=pivot(nums,start,end);
        quicksort(nums,start,p-1);
        quicksort(nums,p+1,end);
    }
    private static int pivot(int[] nums,int start, int end){
        int p=(start+end)/2;
        Arrayintro.swap(nums,p,end);
        p=end;
        int j=start;
        for (int i = start; i <=end ; i++) {
            if(nums[i]<nums[p]){
                Arrayintro.swap(nums,i,j);
                j++;
            }
        }
        Arrayintro.swap(nums,j,p);
        return j;
    }
}

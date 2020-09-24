package com.company.Lecture9;

public class CountSort {
    public static void ZeroOnesort(int[] nums){
        int zeros=0;
        int ones=0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i]==0){
                zeros++;
            }
        }
        for (int i = 0; i < zeros; i++) {
            nums[i]=0;
        }

    }
}

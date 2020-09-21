package com.company.Lecture5;

public class Sorting {
    public static void bubble(int[]nums){
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums.length - 1 - i ; j++) {
                if(nums[j]>nums[j+1]){
                    Arrayintro.swap(nums,j,j+1);
                }
            }
        }
    }
    public static void selection(int[]nums){

        for (int i = 0; i <nums.length ; i++) {
            int m= Arrayintro.maxrange(nums,0, nums.length-1-i);
            Arrayintro.swap(nums,m,nums.length-1-i);
        }
    }
}

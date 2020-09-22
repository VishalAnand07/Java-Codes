package com.company.Lecture6;

import com.company.Lecture5.Arrayintro;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] nums={4,5,1,3,2,0};
        int[] r=inverse(nums);
        System.out.println(Arrays.toString(r));
    }
    public static void reverse(int[] nums){
//        int left=0;
//        int right=nums.length-1;
//        while (left<=right){
//            Arrayintro.swap(nums,left,right);
//            left++;
//            right--;
//        }
        for (int i = 0; i <nums.length/2 ; i++) {
            Arrayintro.swap(nums,i,nums.length-1-i);
        }
    }
    public static int[] inverse(int[] nums){
        int[] res=new int[nums.length];
        for (int p = 0; p <nums.length ; p++) {
            int v=nums[p];
            res[v]=p;
        }
        return res;
    }

}

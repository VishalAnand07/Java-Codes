package com.company.Lecture6;

import com.company.Lecture5.Arrayintro;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] nums= {34,5,56,35};
        insertion(nums);
        System.out.println(Arrays.toString(nums));
//        Arrayintro.display(nums);
    }
    public static void insertion(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j >=1; j--) {
                if(nums[j] < nums[j-1]){
                    Arrayintro.swap(nums,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
}

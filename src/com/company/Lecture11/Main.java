package com.company.Lecture11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        same_sum(nums,0,0,0,new ArrayList<>(),new ArrayList<>());
        same_target(nums,0,new ArrayList<>(),0,3);
    }
    public static void same_sum(int[] nums, int index, int sum1, int sum2, ArrayList<Integer>one,ArrayList<Integer>two){
        if (index==nums.length){
            if(sum1==sum2){
                System.out.println(one+":"+two);
            }
            return;
        }
        int value=nums[index];
        one.add(value);
        same_sum(nums,index+1,sum1+value,sum2,one,two);
        one.remove(one.size()-1);

        two.add(value);
        same_sum(nums,index+1,sum1,sum2+value,one,two);
        two.remove(two.size()-1);
    }
    public static void same_target(int[] nums, int index, ArrayList<Integer>values,int sum,int target){
        if(index==nums.length){
            if(sum==target){
                System.out.println(values);
            }
            return;
        }
        same_target(nums,index+1,values,sum+nums[index],target);
        values.remove(values.size()-1);
    }
}

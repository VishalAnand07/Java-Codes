package com.company.Lecture7;

import com.company.Lecture5.Sorting;

public class BuilderExamples {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
//        builder.insert(1,"oo");
//        builder.delete(2,1);

//        builder.replace(1,1,"oo");
        int[] nums={6,4,45,45,64};
        builder.append("[");
        for (int i = 0; i <nums.length ; i++) {
            builder.append(nums[i]);
            if (i<nums.length-1){
                builder.append(",");
            }
        }
        builder.append("]");
        System.out.println(builder);
    }
}

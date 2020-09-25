package com.company.Lecture10;

public interface TwoDArrays {
    public static void main(String[] args) {
        int [][] nums=new int[5][5];
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums[i].length ; j++) {
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
        int [][] nums2=new int[4][];
        for (int i = 0; i <nums2.length ; i++) {
                System.out.println(nums2[i]);
//            nums2[i]=new int[i+1];
        }
        for (int i = 0; i <nums2.length ; i++) {
            System.out.println(nums2.length);
        }
    }
}

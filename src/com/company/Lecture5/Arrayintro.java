package com.company.Lecture5;

import java.util.Scanner;

public class Arrayintro {
    public static void main(String[] args) {
//        int[] n = new int[10];
//        n[0] = 7;
//        n[8] = 9;
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();// for length
        int [] nums = input(n, s);
        display(nums);
        System.out.println("hello i am back");
        int a = maxIndex(nums);
        System.out.println(a);
        int b=maxrange(nums,1,3);
        System.out.println(b);
//        swap(nums,1,2);
//        display(nums);
//        int[] nums ={23,45,56,89};


//        System.out.println(nums[7]);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }}
    }

    public static void display(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    public static int[] input(int n, Scanner s){
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }
        return nums;
    }
    public static void swap(int[] nums ,int f , int s){
        int temp=nums[f];
        nums[f]=nums[s];
        nums[s]=temp;
    }
    public static int maxIndex(int[]nums){
        int largest = nums[0];
        int index=0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > largest) {
                largest = nums[j];
                index=j;
            }

        }
        return index;
    }
    public static int maxrange(int[]nums,int start,int end){
        int largest = nums[0];
        int index=start;
        for (int j = start; j < end; j++) {
            if (nums[j] > largest) {
                largest = nums[j];
                index=j;
            }

        }
        return index;
    }
}

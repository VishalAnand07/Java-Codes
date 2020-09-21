package com.company.Lecture5;

public class Searching {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int l = binary(nums, 6);
        System.out.println(l);

    }

    public static int Linear(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                return index;
            }
        }
        return -1;
    }

    public static int binary(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return  -1;
    }
}
package com.company.Lecture18;

public class BSTClient {
    public static void main(String[] args) {
        BST<Integer> bst=new BST<>();
        Integer[]nums=new Integer[4];

        for (int i = 1; i <nums.length ; i++) {
            nums[i]=i;
        }
        bst.populatedFromSorted(nums);
        bst.display();
//        bst.display();
//        System.out.println(bst.min());
//        System.out.println(bst.max());

    }
}

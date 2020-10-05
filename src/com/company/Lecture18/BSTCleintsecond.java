package com.company.Lecture18;

public class BSTCleintsecond {
    public static void main(String[] args) {
        BST<Integer> tree=new BST<>();
//        tree.add(15);
//        tree.add(5);
//        tree.add(10);
//        tree.display();
//        tree.rightRotate();
//        tree.display();
        for (int i = 0; i <1000000 ; i++) {
            tree.add(i);
        }
        System.out.println(tree.height());
    }
}

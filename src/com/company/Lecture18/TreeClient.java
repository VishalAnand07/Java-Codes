package com.company.Lecture18;


public class TreeClient {
    public static void main(String[] args) {
        BinaryTreeGeneric<Integer> tree=new BinaryTreeGeneric<>();
        tree.add(10);
        tree.add(20,'l');
        tree.add(25,'r');
        tree.add(30,'l','r');
        tree.add(40,'r','r');
        tree.add(35,'l','r','r');
        tree.display();
//        System.out.println(tree.max());
//        System.out.println(tree.find("10"));
        System.out.println("---------------------------------");
//        tree.orders();
//        int a=tree.diameter();
//        System.out.println(a);
        Integer[] pre={10,5,3,7,6,9};
        Integer[] in={3,5,7,10,6,9};
        tree.fromPreIn(pre,in);
        tree.display();


    }
}

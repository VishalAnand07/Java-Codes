package com.company.Lecture16;

public class LLCleint {
    public static void main(String[] args) {
        Linkedlist list=new Linkedlist();

        list.insertFirst("mohit");
        list.display();
        list.insertFirst("mohini");
        list.display();
        list.insertFirst("mohan");
        list.display();
        list.insertLast("rohan");
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.insertIndex(1,"sumit");
        list.display();
        list.deleteIndex(1);
        list.display();
        System.out.println(list.middle());
        list.reverse();
        list.display();

    }
}

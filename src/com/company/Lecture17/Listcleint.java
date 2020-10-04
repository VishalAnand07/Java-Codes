package com.company.Lecture17;

public class Listcleint {
    public static void main(String[] args) {
        LinkedListGeneric<Character> list=new LinkedListGeneric<>();
        list.insertLast('a');
        list.insertLast('b');
        list.insertLast('v');
        list.insertLast('y');
//        list.insertfirst("mohita");
//        list.insertfirst("mohan");
//        list.display();
//        list.display();
//        list.insertfirst("rohit");
//        list.insertfirst("rohan");
        list.display();
    }
}

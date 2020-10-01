package com.company.Lecture14;

public class QueueCleint {
    public static void main(String[] args) {
        Queue s=new Queue();
        s.insert(12);
        s.insert(45);
        s.insert(123);
        s.display();
        s.delete();
        s.display();
    }

}

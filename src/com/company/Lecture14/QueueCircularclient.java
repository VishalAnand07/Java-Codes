package com.company.Lecture14;

public class QueueCircularclient {
    public static void main(String[] args) {
        QueueCircular s=new QueueCircular();
        s.insert(45);
        s.insert(12);
        s.display();
        s.remove();
        s.display();
    }
}

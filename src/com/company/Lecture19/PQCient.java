package com.company.Lecture19;

import java.util.PriorityQueue;

public class PQCient {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        queue.add(2);
        queue.add(4);
        queue.add(3);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}

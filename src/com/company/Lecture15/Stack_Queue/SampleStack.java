package com.company.Lecture15.Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SampleStack {
    public static void main(String[] args) {
        Stack<Integer> naam=new Stack<>();
        naam.push(6578);
        naam.push(657);
        System.out.println(naam.pop());
        System.out.println(naam.pop());

        Queue<Integer> queue=new LinkedList<>();
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }

}

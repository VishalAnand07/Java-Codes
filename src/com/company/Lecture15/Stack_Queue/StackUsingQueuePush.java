package com.company.Lecture15.Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueuePush {
    private Queue<Integer>queue=new LinkedList<>();
    public Integer pop(){
        Queue<Integer>temp=new LinkedList<>();
        Integer val=null;
        while (!queue.isEmpty()){
            val=queue.remove();
            if(queue.isEmpty()){
                break;
            }
            temp.add(val);
        }
        while (!temp.isEmpty()){
            queue.add(temp.remove());
        }
        return val;
    }
    public void push(int item){
        queue.add(item);
    }
}

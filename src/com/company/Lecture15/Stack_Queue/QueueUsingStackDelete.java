package com.company.Lecture15.Stack_Queue;

import java.util.Stack;

public class QueueUsingStackDelete {
        private Stack<Integer> stack =new Stack<>();
        public void add(int item){
            Stack<Integer>temp=new Stack<>();
            while (!stack.isEmpty()){
                temp.push(stack.pop());
            }
            stack.push(item);
            while(!temp.isEmpty()){
                stack.push(temp.pop());
            }
        }
        public Integer remove(){
            return stack.pop();
        }
        public boolean isempty(){
            return stack.empty();
        }
        public Integer front() {
            return stack.peek();
        }
}


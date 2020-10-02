package com.company.Lecture15;

public class StackCleint {
    public static void main(String[] args) {
        Stack s= new DynamicStack();
        for (int i = 0; i <100 ; i++) {
            s.push(i);
        }
        for (int i = 0; i <100 ; i++) {
            System.out.println(s.pop());
        }
    }

}

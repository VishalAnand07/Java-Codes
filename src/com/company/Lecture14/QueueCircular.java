package com.company.Lecture14;

public class QueueCircular {
    private int[] data;
    private int end;
    private int front;
    private int size;
    private static final int DEFAULT_SIZE=10;

    public QueueCircular(){
        this(DEFAULT_SIZE);
    }

    public QueueCircular(int size){
        this.data=new int[size];
        this.end=-1;;
        this.front=0;
        this.size=0;
    }
    public void insert (int value){
        if(!this.isFull()){
            this.end=(this.end+1)%this.data.length;
            this.data[this.end]=value;
            size++;
        }
    }
    public Integer remove(){
        if ((!isEmpty())){
            int val=data[front];
            front=(front+1)%data.length;
            size--;
            return val;
        }
        return  null;
    }
    public boolean isFull(){
        return this.size==this.data.length;
    }
    public boolean isEmpty(){
        return  this.size==0;
    }
    public void display(){
        for (int i = 0; i < size ; i++) {
            System.out.print(data[(front+i)%data.length]);
            if(i< size - 1){
                System.out.print(",");
            }
        }
        System.out.println();
    }
}

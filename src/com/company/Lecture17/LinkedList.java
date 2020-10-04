package com.company.Lecture17;


import sun.awt.image.ImageWatched;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void insertfirst(String value){
        Node node =new Node(value, head);
        head=node;
        if (size==0){
            tail=head;
        }
        size++;
    }
    public void insertLast(String value){
        if(size==0){
            insertfirst(value);
            return;
        }
        Node node =new Node(value);
        tail.next=node ;
        tail=node;

        size++;
    }
    public void display(){
        Node node =head;
        while(node!=null){
            System.out.print(node.value+"->");
            node =node.next;
        }
        System.out.println("null");
    }
    private class Node{
        String value;
        Node next;

        public Node(String value) {
            this.value = value;
        }

        public Node(String value,Node next) {
            this.value=value;
            this.next = next;
        }
    }
    public String deleteFirst(){
        if(size==0){
            return null;
        }
        String value=head.value;
        head=head.next;
        size--;
        if(size==0){
            tail=null;
        }
        return value;
    }
    public Node get(int index){
        Node node=head;
        for (int i = 1; i <=index ; i++) {
            node=node.next;
        }
        return node;
    }
    public String deleteLast(){
        if(size<2){
            return deleteFirst();
        }
        Node prev=get(size-2);
        String value=tail.value;
        prev.next=null;
        tail=prev;
        size--;
        return value;
    }
    public void insert(int index ,String value){
        if (index==0){
            insertfirst(value);
            return;
        }else if(index==size){
            insertLast(value);
        }else{
            Node prev=get(index-1);
            Node node=new Node(value);
            node.next=prev.next;
            prev.next=node;
            size++;
        }
    }
    public String delete(int index){
        if(index==0){
            return deleteFirst();
        }else if(index==size-1){
            return deleteLast();
        }else{
            Node prev=get(index-1);
            String value=prev.next.value;
            prev.next= prev.next.next;
            size--;
            return value;
        }
    }
    public static LinkedList merge(LinkedList first,LinkedList second){
        LinkedList result=new LinkedList();
        Node f=first.head;
        Node s=second.head;
        while(f!=null && s!=null){
            if(f.value.compareTo(s.value)<0){
                result.insertLast(f.value);
            }else{
                result.insertLast(s.value);
                s=s.next;
            }
        }
        while(f!=null){
            result.insertLast(f.value);
            f=f.next;
        }
        while (s!=null){
            result.insertLast(s.value);
            s=s.next;
        }
        return result;
    }

}

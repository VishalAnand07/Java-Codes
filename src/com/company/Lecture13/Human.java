package com.company.Lecture13;

public class Human {
    public String name;
    public int age;
    public Human(){
//        population++;
    }
    public Human(String name,int age,int balance){
        this.name=name;
        this.age=age;
        this.balance=balance;
    }
    public static int balance=1000;
    public void udarr(){
        if (balance>=100){
            balance=balance-100;
        }else{
            System.out.println("bhai tu ab jaan hi lele");
        }
    }
}


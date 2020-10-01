package com.company.Lecture14.Inheritance;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Car mycar=new Car();
        System.out.println(mycar.doors);
        Maruti myMaruti=new Maruti();
        System.out.println(myMaruti.doors);
        mycar.start();
        myMaruti.start();
        Car c=new Maruti();
        c.start();
//        int m=max(7,23,765,75,435);
    }
//    public static int max(int k,int items){
//        for (int i = 0; i < ; i++) {
//
//        }
//    }
}

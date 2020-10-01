package com.company.Lecture14.Inheritance;

public class Car extends Vehicle {
    public int doors=4;
    public int wheels=5;
    public Car(){}
    public Car(String License){
//        super(License);
    }
    public void start(){
        System.out.println("start like a generic");
    }

    @Override
    public void pollution() {
        System.out.println("this is how you check pollution");
    }
}

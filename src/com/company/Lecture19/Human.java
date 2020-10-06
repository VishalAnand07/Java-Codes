package com.company.Lecture19;

public class Human implements Comparable<Human> {
    private String name;
    private int age;

    public Human(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Human o) {
        return this.age - o.age;
    }
}

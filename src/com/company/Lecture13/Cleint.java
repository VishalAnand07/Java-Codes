package com.company.Lecture13;

public class Cleint {
    public static void main(String[] args) {
        Human yash= new Human("yash ji",60,1000);
        System.out.println(yash.name);
        System.out.println(yash.age);
        yash.name="yash chopra";
        yash.age=67;
        System.out.println(yash.name);
        System.out.println(yash.age);
//        yash.udarr();
//        System.out.println(yash.balance);
        Human deepansh=new Human();
        deepansh.udarr();
        System.out.println(deepansh.balance);
        Human baby =deepansh;
        baby =yash;
        System.out.println(deepansh.name);
    }
}

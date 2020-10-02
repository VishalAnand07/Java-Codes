package com.company.Lecture15;

public class Cleint {
    public static void main(String[] args) {
        Teacher t =new CBTeacher();
        t.study();
        t.teach();
        Student s=new CBStudent();
        s.play();
        s.study();
        Student ta=new CBTA();
        ta.play();
        ta.study();
    }
}

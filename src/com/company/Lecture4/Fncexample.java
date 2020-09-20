package com.company.Lecture4;

import java.util.Scanner;

public class Fncexample {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        int step =s.nextInt();
        Converter(start,end,step);

    }

    public static void  Converter(int s,int e,int step){
        while (s<= e){
            float c=(5f/9)*(s-32);
            System.out.println(c);
            s+=step;
        }
    }
}

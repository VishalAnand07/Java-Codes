package com.company.Lecture3;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count =0;
        while (n>0){
            int r=n%10;
            n=n/10;

            if (r==5){
                count++;

            }
        }
        System.out.println(count);
    }
}

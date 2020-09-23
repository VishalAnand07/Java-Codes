package com.company.Lecture7;

import java.util.Scanner;

public class Patternsexamples {
    public static void main(String[] args) {
        pascal(5);
    }
    public static void diamond(int n){
        int space=n-1;
        int star=1;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j <space ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <star ; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i<n-1){
                star+=2;
                space-=1;
            }else{
                star-=2;
                space+=1;
            }
        }
    }
    public static void pascal(int num){
        for (int n = 0; n <num ; n++) {
            int val=1;
            for (int r = 0; r <=n ; r++) {
                System.out.print(val+" ");
                val=val*(n-r)/(r+1);
//                int val=fact(n)/fact(r)*fact(n-r);
//                System.out.println(val + " ");
            }
            System.out.println();
        }
    }
    public static int fact(int n){
        int acc=1;
        for (int i = 1; i <=n ; i++) {
            acc=acc*i;
        }
        return acc;
    }
}

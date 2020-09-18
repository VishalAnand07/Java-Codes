package com.company.Lecture3;

public class Hollow {
    public static void main(String[] args) {
        int n=5;
        int r=0;
        while (r<n){
            int c=0;
            while(c<n){
                if (r == 0 || r == n-1 || c == 0 || c == n-1) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                c++;
            }
            System.out.println();
            r++;
        }
    }
}

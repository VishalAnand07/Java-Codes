package com.company.Lecture3;

import java.util.Scanner;

public class Bintodec {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int bin = s.nextInt();
        int dec = 0;
        int p = 1;
        while (bin > 0){
            int r = bin % 10;
            bin = bin / 10;
            dec = dec + ( r * p );
            p = p * 2;

        }
        System.out.println(dec);
    }
}

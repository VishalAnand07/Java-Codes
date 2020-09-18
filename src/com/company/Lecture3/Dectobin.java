package com.company.Lecture3;

import java.util.Scanner;

public class Dectobin {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int dec = s.nextInt();
        int bin = 0;
        int p = 1;
        while (dec > 0){
            int r = dec % 2;
            dec = dec / 2;
            bin = bin + ( r * p );
            p = p * 10;

        }
        System.out.println(bin);
    }
}

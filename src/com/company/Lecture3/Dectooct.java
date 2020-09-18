package com.company.Lecture3;

import java.util.Scanner;

public class Dectooct {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int dec = s.nextInt();
        int oct = 0;
        int p = 1;
        while (dec > 0){
            int r = dec % 8;
            dec = dec / 8;
            oct = oct + ( r * p );
            p = p * 10;

        }
        System.out.println(oct);
    }
}

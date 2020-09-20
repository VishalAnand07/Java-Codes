package com.company.Lecture4;

public class Converter {
    public static void main(String[] args) {
//        int any = deci2any(10, 2);
//        System.out.println(any);
//        int bin = deci2bin(10);
//        System.out.println(bin);
//        int dec = bin2dec(0);
//        System.out.println(dec);
//        int  any1 = any2dec(2,10);
//        System.out.println(any1);
        int any2=any2any(33,8,2);
        System.out.println(any2);
    }

    public static int deci2bin(int dec) {
        int place = 1;
        int bin = 0;
        int r = 0;
        while (bin > 0) {
            r = dec % 2;
            dec = dec / 2;
            bin = bin + r * place;
            place = place * 10;
        }
        return bin;

    }

    public static int deci2any(int dec, int base) {
        int place = 1;
        int any = 0;
        int r = 0;
        while (dec > 0) {
            r = dec % base;
            dec = dec / base;
            any = any + r * place;
            place = place * 10;

        }
        return any;
    }

    public static int bin2dec(int bin) {
        int place = 1;
        bin = 0;
        int dec = 0;
        int r = 0;
        while (bin > 0) {
            r = bin % 10;
            bin = bin / 10;
            dec = dec + r * place;
            place = place * 2;

        }
        return dec;
    }

    public static int any2dec(int dec, int base) {
        int place = 1;
        int any = 33;
        int r = 0;
        while (any > 0) {
            r = any % 10;
            any = any / 10;
            dec = dec + r * place;
            place = place * base;

        }
        return dec;
    }
    public static int any2any(int value, int s_base, int d_base){

        int deci = any2dec(value, s_base);

        return deci2any(deci, d_base);
    }

}
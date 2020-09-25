package com.company.Lecture10;

import java.util.ArrayList;
import java.util.Arrays;

public class Lexopermute {
    public static void main(String[] args) {
//        int [] f=freq("asdffgfghghvhhnbvvvcff");
        String line ="aba";
        int[] f=freq(line);
        lexo("",f,line.length());
        System.out.println(Arrays.toString(f));
        lexoNumbers(0,100);
    }
    public static void lexo(String processed, int[] f, int length){
        if (length==0){
            System.out.println(processed);
            return;
        }
        for (int i = 0; i <f.length ; i++) {
            if(f[i]>0){
                f[i]--;
                lexo(processed+(char)(i+'a'),f,length-1);
                f[i]++;
            }
        }
    }
    public  static int[] freq(String line){
        //create a freq array of size 26
        // trev through line and for each char inc index val
        int[] f=new int[26];
        for (int i = 0; i <line.length() ; i++) {
                char ch= line.charAt(i);
                f[ch-'a']++;
        }
        return  f;
    }
    public static void lexoNumbers(int val, int target){

        if (val>target){
           return;
        }
        for (int i = 0; i <10 ; i++) {
            if (val==0&&i==0){
                continue;
            }
            int v=val*10+i;
            if (v<=target){
                System.out.println(v);
                lexoNumbers(v,target);
            }
        }
    }
}

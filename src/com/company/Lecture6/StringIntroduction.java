package com.company.Lecture6;

import java.util.Arrays;

public class StringIntroduction {
    public static void main(String[] args) {
        String greet="hohoho";
        String pall="naman";
        String h="hello";
        String a=new String("hello");
        System.out.println(h.equals(a));
//        String second="student";
//        char[] chars=greet.toCharArray();
//        String total =greet.concat(Integer.toString(1));
//        System.out.println(total);
//        substrings(greet);
        System.out.println(greet.indexOf("h",3));
        System.out.println(greet.startsWith("hoh",0));

//        for (int i = 0; i <10 ; i++) {
//            String total = greet.concat(second);
//        }
//        for (int i = 0; i <greet.length() ; i++) {
//            System.out.println(greet.charAt(i));
//        }
//        System.out.println(Arrays.toString(chars));
        System.out.println(greet);
    }
    public static void print(String line){
        for (int i = 0; i <line.length() ; i++) {

        }
    }
    public static void substrings(String line){
        for (int i = 0; i <line.length(); i++) {
            for (int j = i+1; j <= line.length() ; j++) {
                System.out.println(line.substring(i,j));
            }
        }
    }
//    public static boolean pallin(String line) {
//        int left=0;
//        int right=line.length()-1;
//        while(left<right){
//            if (line.charAt(left)!=line.charAt(right)){
//
//            }
//        }
//    }
}

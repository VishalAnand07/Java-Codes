package com.company.Lecture9;

public class Permutation {
    public static void main(String[] args) {
       int a= permutecount("abc","d");
        System.out.println(a);
    }
    public static void permute(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        for (int i = 0; i <=processed.length() ; i++) {
            String first =processed.substring(0,i);
            String second =processed.substring(i);
            permute(first+ch+second,unprocessed);
        }
    }
    public static int permutecount(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return 1 ;
        }
        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        int count=0;
        for (int i = 0; i <=processed.length() ; i++) {
            String first =processed.substring(0,i);
            String second =processed.substring(i);
            count+=permutecount(first+ch+second,unprocessed);
        }
        return count;
    }
}

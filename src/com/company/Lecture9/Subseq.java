package com.company.Lecture9;

import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        asciisubseq("","ab");
//        subseq("","abc");

    }
    public static void subseq(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch= unprocessed.charAt(0);
        unprocessed= unprocessed.substring(1);
        subseq(processed+(ch),unprocessed);
        subseq(processed,unprocessed);
    }
    public static void asciisubseq(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch= unprocessed.charAt(0);
        unprocessed= unprocessed.substring(1);
        asciisubseq(processed+(ch),unprocessed);
        asciisubseq(processed+(int)(ch),unprocessed);
        asciisubseq(processed,unprocessed);
    }
    public static void asciisubseqcount(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return ;
        }

        char ch= unprocessed.charAt(0);
        unprocessed= unprocessed.substring(1);
        asciisubseqcount(processed+(ch),unprocessed);
        asciisubseqcount(processed+(int)(ch),unprocessed);
        asciisubseqcount(processed,unprocessed);
    }
    public static void subseqList(String processed, String unprocessed,ArrayList list){
        if (unprocessed.isEmpty()) {
            if (!processed.isEmpty()) {
                list.add(processed);
                return;
            }
        }

        char ch= unprocessed.charAt(0);
        unprocessed= unprocessed.substring(1);
        subseqList(processed+(ch),unprocessed,list);
        subseqList(processed,unprocessed,list);
    }
}

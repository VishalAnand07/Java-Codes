package com.company.Lecture9;

import java.util.ArrayList;

public class Board {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boardlist("",4,3,list);
        System.out.println(list);
    }
    public static void board(String processed,int target, int face){
        if (target==0){
            System.out.println(processed);
            return;
        }
        for (int i = 1; i <=face && i<=target ; i++) {
            board(processed+i,target-i,face);
        }
    }
    public static int boardcount(String processed,int target, int face){
        if (target==0){
            System.out.println(processed);
            return 1;
        }
        int count =0;
        for (int i = 1; i <=face && i<=target ; i++) {
            count+=boardcount(processed+i,target-i,face);
        }
        return count;
    }
    public static void boardlist(String processed, int target, int face, ArrayList<String> list){
        if (target==0){
            list.add(processed);
            return;
        }
        for (int i = 1; i <=face && i<=target ; i++) {
            boardlist(processed+i,target-i,face,list);
        }
    }
}

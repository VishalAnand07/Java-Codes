package com.company.Lecture10;

public class Maze {
    public static void main(String[] args) {
//        int a=mazeDcount(3,3);
//        System.out.println(a);
//        int b=mazecount(4,3);
//        System.out.println(b);
//        mazePath("",3,4);
        mazepathDiag("",3,3);
    }
    public static int mazecount(int row ,int col){
        if (row==1 && col==1){
            return  1;
        }
        int count=0;
        if(row>1){
            count+=mazecount(row-1,col);
        }
        if(col>1){
            count+=mazecount(row,col-1);
        }
        return count;
    }
    public static int mazeDcount(int row ,int col){
        if (row==1 && col==1){
            return  1;
        }
        int count=0;
        if(row>1){
            count+=mazeDcount(row-1,col);
        }
        if(col>1){
            count+=mazeDcount(row,col-1);
        }
        if (row>1 && col>1){
            count+=mazeDcount(row-1,col-1);
        }
        return count;
    }
    public static void mazePath(String path, int row ,int col){
        if (row==1 && col==1){
            System.out.println(path);
            return ;
        }
        ;
        if(row>1){
            mazePath(path+"V",row-1,col);
        }
        if(col>1){
            mazePath(path+"H",row,col-1);
        }
    }
    public static void mazepathDiag(String path,int row ,int col){
        if (row==1 && col==1){
            System.out.println(path);
            return;
        }
        if(row>1){
            mazepathDiag(path+"V",row-1,col);
        }
        if(col>1){
            mazepathDiag(path+"H",row,col-1);
        }
        if(row>1 && col>1){
            mazepathDiag(path+"D",row-1,col-1);
        }
    }
}

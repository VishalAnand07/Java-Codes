package com.company.Lecture10;

public class MazeBoard {
    public static void main(String[] args) {
        int row=4;
        int col=4;
        boolean[][]maze=new boolean[row+1][col+1];
        maze("",0,0,3,2,maze);
        int a=mazeCount("",0,0,3,2,maze);
        System.out.println(a);
    }
    public static void maze(String path,int c_row,int c_col,int row, int col,boolean[][]maze){
        //mil gaya khanaa
        if(c_row==row && c_col==col){
            System.out.println(path);
            return;
        }
        //maze se bahar jayega kya;
        if(c_col<0||c_row<0||c_row>row||c_col>col){
            return;
        }
        //bhai yaha already aa chuka hai
        if (maze[c_row][c_col]){
            return;
        }
        //ab se ye bhi visited
        maze[c_row][c_col]=true;
        maze(path+"U",c_row-1,c_col,row,col,maze);
        maze(path+"R",c_row,c_col+1,row,col,maze);
        maze(path+"D",c_row+1,c_col,row,col,maze);
        maze(path+"L",c_row,c_col-1,row,col,maze);
        //ab yaha vapas aa sakta  hai
        maze[c_row][c_col]=false;
    }
    public static int mazeCount(String path,int c_row,int c_col,int row, int col,boolean[][]maze){
        //mil gaya khanaa
        int count =0;
        if(c_row==row && c_col==col){
            System.out.println(path);
            return 1;
        }
        //maze se bahar jayega kya;
        if(c_col<0||c_row<0||c_row>row||c_col>col){
            return 0;
        }
        //bhai yaha already aa chuka hai
        if (maze[c_row][c_col]){
            return 0;
        }
        //ab se ye bhi visited
        maze[c_row][c_col]=true;
        count+=mazeCount(path+"U",c_row-1,c_col,row,col,maze);
        count+=mazeCount(path+"R",c_row,c_col+1,row,col,maze);
        count+=mazeCount(path+"D",c_row+1,c_col,row,col,maze);
        count+=mazeCount(path+"L",c_row,c_col-1,row,col,maze);
        //ab yaha vapas aa sakta  hai
        maze[c_row][c_col]=false;
        return count;
    }
}

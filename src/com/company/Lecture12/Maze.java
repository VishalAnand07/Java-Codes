package com.company.Lecture12;

public class Maze {
    public static void main(String[] args) {

    }
    public static int maze(int row,int col){
        if (row==1 || col==1){
            return 1;
        }
        return maze(row-1,col)+maze(row,col+1);
    }
    public static int mazeDP(int row,int col,Integer[][]memory){
        if (row==1 || col==1){
            return 1;
        }
        if(memory[row][col]!=null){
            return memory[row][col];
        }
        memory[row][col]=mazeDP(row-1,col,memory)+mazeDP(row,col-1,memory);
        return mazeDP(row-1,col,memory)+mazeDP(row,col+1,memory);
    }
    public static int mazeDPItr(int row,int col,Integer[][]memory){
        for (int r = 1; r <=row ; r++) {
            for (int c = 1; c <=col ; c++) {
                if (row==1 || col==1){
                    return memory[r][c]=1;
                }else{
                    memory[r][c]=memory[r-1][c]+memory[r][c-1];
                }
            }
        }
        return memory[row][col];

    }

}

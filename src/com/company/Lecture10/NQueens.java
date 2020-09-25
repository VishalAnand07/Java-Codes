package com.company.Lecture10;

public class NQueens {
    public static void main(String[] args) {
        int i=4;
//        boolean[][]
    }
    public static  void NQueens(boolean[][]board,int row ){
        if(row==board.length){
//            display(board);
            return;
        }
        for (int col = 0; col <board.length; col++) {
            if (isSafe(board,row,col)){
                board[row][col]=true;
                NQueens(board,row+1);
                board[row][col]=false;
            }
        }
    }
    public  static boolean isSafe(boolean[][]board,int row,int col){
        for (int r = 0; r <row ; r++) {
            if(board[r][col]){
                return false;
            }
        }
        int left_step=Math.min(row,col);
        for (int i = 1; i <left_step ; i++) {
            if (board[row-i][col-i]){
            return false;
            }
        }
        int right_step=Math.min(row,board.length-1-col);
        for (int i = 0; i <right_step ; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        return  true;
    }

}

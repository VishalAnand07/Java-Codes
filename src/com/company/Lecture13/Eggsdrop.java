package com.company.Lecture13;

public class Eggsdrop {
    public static void main(String[] args) {
        System.out.println(eggdrop(2,10));
    }
    public static int eggdrop(int eggs,int floors){
        if(floors==0){
            return 0;
        }
        if (eggs==1){
            return floors;
        }
        int minimum=floors;
        for (int f = 1; f <=floors ; f++) {
            int down=eggdrop(eggs-1,f-1);
            int up=eggdrop(eggs,floors-f);
            int max =1+ Math.max(up,down);
            if(max<minimum){
                minimum=max;
            }
        }
        return minimum;
    }
    public static int eggdropdpItr(int eggs,int floors,Integer [][] memory){
        if(floors==0){
            return 0;
        }
        if (eggs==1){
            return floors;
        }
        if(memory[eggs][floors]!=null){
            return memory[eggs][floors];
        }
        int minimum=floors;
        for (int f = 1; f <=floors ; f++) {
            int down=eggdropdpItr(eggs-1,f-1, memory);
            int up=eggdropdpItr(eggs,floors-f,memory);
            int max =1+ Math.max(up,down);
            if(max<minimum){
                minimum=max;
            }
        }
        return minimum;
    }
}

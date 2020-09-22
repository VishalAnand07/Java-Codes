package com.company.Lecture6;

public class StringbuilderExamples {
    public static void main(String[] args) {
        String line="HelenGYIguibuiYgv";
//        StringBuilder h = new StringBuilder("hello");
//        System.out.println(h.toString());
//        for (int i = 0; i < 100000; i++) {
//            h.append("a");
//        }
    }
    public static String toggle(String line){
        StringBuilder builder= new StringBuilder();
        for (int i = 0; i <line.length() ; i++) {
            char ch=line.charAt(i);

            if(ch>='a'&& ch<='z'){
                ch=(char)(ch-'a'+'A');
            }else if(ch>='A' && ch<='Z'){
               ch=(char)(ch-'A'+'a');
            }
            builder.append(ch);
        }
        return builder.toString();
    }
}

package com.company.Lecture12;

public class EditDistance {
    public static void main(String[] args) {


    }
    public static int edit_dist(String f,String s,int flen, int slen){
        if(flen==0){
            return slen;
        }
        if (slen==0){
            return flen;
        }
        int c =0;
        if (f.charAt(flen-1)==s.charAt(slen-1)){
            c=1+edit_dist(f,s,flen-1,slen-1);
        }else{
            int rmf=edit_dist(f,s,flen-1,slen);
            int rms=edit_dist(f,s,flen,slen-1);
            int replace=edit_dist(f,s,flen-1,slen-1);
            c=Math.min(replace,Math.min(rmf,rms));
        }
        return c;
    }
    public static int editdistDPItr(String f,String s){
        Integer[][] memory=new Integer[f.length()+1][s.length()];
        for (int flen = 0; flen <=f.length() ; flen++) {
            for (int slen = 0; slen <=s.length() ; slen++) {
                if(flen==0){
                    memory[flen][slen]=slen;
                }else if(slen==0){
                    memory[flen][slen]=flen;
                }else{
                    if(f.charAt(flen-1)==s.charAt(slen-1)){
                        memory[flen][slen]=memory[flen-1][slen-1];
                    }else{
                        int rmf=memory[flen-1][slen]+1;
                        int rms=memory[flen][slen-1]+1;
                        int replace=memory[flen-1][slen-1]+1;
                        memory[flen][slen]=Math.min(replace,Math.min(rmf,rms));
                    }
                }
            }
        }
        return memory[f.length()][s.length()];
    }
}

package com.ak.adventures;

public class EditDiff {
    public static final int DIFF = 1;
    public static void main(String[] args){
        editApart("bath","bat");
    }
    public static boolean editApart(String a, String b){
        boolean editApart = false;
        int lDiff = Math.abs(a.length()-b.length());
        String ls = (a.length()>b.length())? a : b;
        String ss = (a.length()>b.length())? b : a;
        System.out.println("longer string="+ls);
        System.out.println("shorter string="+ss);
        char[] lArr = ls.toCharArray();

        if(lDiff==0){
            for(int i=0; i<lArr.length; i++){
                if(lArr[i]!=ss.charAt(i)){
                    lDiff++;
                    if(lDiff>DIFF){
                        break;
                    }
                }
            }
        }
        else if(lDiff<=DIFF){
            lDiff=0;
            int j=0;
            for (char c : lArr) {
                char d;
                try{
                    d = ss.charAt(j);
                } catch (StringIndexOutOfBoundsException e){
                    lDiff++;
                    if (lDiff > DIFF) {
                        break;
                    }
                    continue;
                }
                if (c == d) {
                    j++;
                } else {
                    lDiff++;
                    if (lDiff > DIFF) {
                        break;
                    }
                }
            }
        }
        editApart = (lDiff<=DIFF);
        System.out.println(editApart);
        return editApart;
    }
}

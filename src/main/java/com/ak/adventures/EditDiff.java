package com.ak.adventures;

public class EditDiff {
    public static final int DIFF = 1;
    public static void main(String[] args){
        editApart("cat","dog");
    }
    public static boolean editApart(String a, String b){
        boolean editApart = false;
        int lDiff = Math.abs(a.length()-b.length());
        String c = (a.length()>b.length())? a : b;
        if(lDiff==DIFF){

        }
        return editApart;
    }
}

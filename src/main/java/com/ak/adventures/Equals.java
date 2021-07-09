package com.ak.adventures;

import java.util.HashMap;
import java.util.Map;

public class Equals {
    public static void main(String[] args){
        System.out.print(isEqual("lilac", "icall"));
    }

    public static boolean isEqual(String a, String b){
        return (mapString(a)==mapString(b));
    }

    public static int mapString(String word){
        int hash = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : word.toCharArray()){
            if(map.containsKey(c)){
                int v = map.get(c);
                v++;
                map.replace(c,v);
            } else {
                map.put(c,1);
            }
        }
        for(Map.Entry<Character, Integer> r : map.entrySet()){
            hash = r.getKey() + r.getValue();
        }
        return hash;
    }
}

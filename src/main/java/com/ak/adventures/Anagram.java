package com.ak.adventures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {
    public static final String[] words = {
            "ad", "bc", "words", "sword", "tin", "nit"
    };
    public static void main(String[] args){
        HashMap<Integer, List<String>> anagrams = new HashMap<>();

        for(String word : words) {
            int k = mapString(word);
            if(anagrams.containsKey(k)){
                List<String> v = anagrams.get(k);
                v.add(word);
                anagrams.replace(k,v);
            } else {
                ArrayList<String> v = new ArrayList<>();
                v.add(word);
                anagrams.put(k, v);
            }
        }

        System.out.print(anagrams.values());
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

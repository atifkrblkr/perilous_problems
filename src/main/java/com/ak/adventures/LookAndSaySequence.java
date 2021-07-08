package com.ak.adventures;

public class LookAndSaySequence {
    public static final char EMPTY = '\0';
    public static void main(String[] args){
        generate("1", 10);
    }

    public static void generate(String feed, int reps){
        System.out.println(feed);
        if(feed.length()<1) throw new IllegalArgumentException("feed length should be at least 1");
        for (;reps>0;reps--){
            StringBuilder say = new StringBuilder();
            if(feed.length()==1){
                say.append(1).append(feed);
            } else {
                StringBuilder chunk = new StringBuilder();
                char[] cs = feed.toCharArray();
                for(int i=0; i<cs.length-1; i++){
                    char c = cs[i];
                    char cn = cs[i+1];
                    chunk.append(c);
                    if (c != cn) {
                        say.append(chunk.toString().length()).append(c);
                        chunk = new StringBuilder();
                        if(i==cs.length-2){
                            say.append(1).append(cn);
                        }
                    } else if(i==cs.length-2) {
                        say.append(chunk.toString().length()+1).append(c);
                        chunk = new StringBuilder();
                    }
                }
            }

            System.out.println(say);
            feed = say.toString();
        }
    }
}

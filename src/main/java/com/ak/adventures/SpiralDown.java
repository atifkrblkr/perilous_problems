package com.ak.adventures;

public class SpiralDown {
    public static void main(String[] args) {
        printSpiral(5);
    }

    public static void printSpiral(final int n){
        if(n<1 || n>10000)
            throw new IllegalArgumentException("0 < n < 10,000");

        int[][] arr = new int[n][n];
        int[] id = {0,1,0,-1}, jd = {1,0,-1,0}, hopPlan = new int[2*n+1];
        int val=1, lim=n*n, i=0, j=0, dir=0, hops=0, x=n, turns=0;

        for(int y=0; y<2*n+1; y++){
            hopPlan[y]=x;
            if(y%2==0){
                x--;
            }
        }

        while(val<=lim){
            arr[i][j]=val;
            val++;
            hops++;
            if(hopPlan[turns]==hops){
                hops=0;
                turns++;
                dir++;
                dir%=4;
            }
            i+=id[dir];
            j+=jd[dir];
        }

        for(int a=0; a<n; a++){
            for(int b=0; b<n; b++){
                System.out.print(arr[a][b]+" ");
            }
            System.out.println();
        }
    }
}
package com.cleo.JBDL.collections;

public class Problems {
    public static boolean isPalin(String s){
        // code here
        return s.toLowerCase().equals(new StringBuilder(s.toLowerCase()).reverse().toString());


    }
     long result=0;
    public long toh(int N, int from, int to, int aux) {
        // Your code here
        if(N<1)
            return result;


         toh(N - 1, from, aux, to);

            System.out.println("move disk " +N + " from rod " + from + " to rod " + to);
           toh(N - 1, aux,  to,from);
        result+=1;
        return result;


    }
    //move disk 1 from rod 1 to rod 3
    //move disk 2 from rod 1 to rod 2
    //move disk 1 from rod 3 to rod 2
    //move disk 3 from rod 1 to rod 3
    //move disk 1 from rod 2 to rod 1
    //move disk 2 from rod 2 to rod 3
    //move disk 1 from rod 1 to rod 3
    public long toh(int N){
        // long[] result = new long[1];
     return    toh(N,1,3,2);

    }
    public static void main (String[] args) {
        System.out.println(isPalin("TenET"));
        System.out.println(new Problems().toh(3));
    }
}

package com.cleo.JBDL.dsa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return first + ":" + second;
    }
}


public class AllPairs {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here
        Arrays.sort(A);
        Arrays.sort(B);
        long min = Math.min(N,M);
        List<long[]> list= new ArrayList<>();
        for (int i = 0; i < min; i++) {
            for (int j = 0; j < min; j++) {
                if(A[i]+B[j]==X){
                    list.add(new long[]{A[i],B[j]});
                }
            }
        }
        pair[] answer = new pair[list.size()];
        int i=0;
        for(long[] l:list){
            answer[i++]=new pair(l[0],l[1]);
        }
        return answer;
    }

    public static void main(String[] args) {
        AllPairs p = new AllPairs();
        long[] A ={1, 2, 4, 5, 7};
        long[] B =   {5, 6, 3, 4, 8};
        pair[] pairs = p.allPairs(A,B,A.length,B.length,9);
        System.out.println(Arrays.toString(pairs));

    }
}

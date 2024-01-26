package com.cleo.JBDL.dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayProblems {
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        int max=Integer.MIN_VALUE,second_max=Integer.MIN_VALUE;
        ArrayList<Integer> answer = new ArrayList<>();
        for(int el:arr)
            if(max<el)
                max=el;
        answer.add(max);
        for(int el:arr)
            if(second_max<el&&el!=max)
                second_max=el;
        if(second_max==Integer.MIN_VALUE)
            second_max=-1;
        answer.add(second_max);
        return answer;
    }

    public static void main (String[] args) {
        System.out.println(largestAndSecondLargest(3,new int[]{2,1,2}));
    }

}

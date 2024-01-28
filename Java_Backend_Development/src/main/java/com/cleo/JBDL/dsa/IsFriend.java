package com.cleo.JBDL.dsa;

import java.util.*;
import java.util.function.DoubleBinaryOperator;
public class IsFriend {
    public static String isFriend(int n, int x, int y, int[] arr) {
        // code here
        for(int el:arr){
            if(el+x==y)
                return "yes";
        }
        return "no";
    }
    public static int minimizeArrayScore(int n, int[] arr) {
        // code here
        Arrays.sort(arr);
       // System.out.println(Arrays.toString(arr));
        //int[] arr_copy = new int[n/2];
        int low=0,high=n-1;
        //int i=0;
        int max=Integer.MIN_VALUE;
        while(low<high){
            int sum=arr[low]+arr[high];
            low++;high--;
            if(max<sum)
                max=sum;
        }
        return max;
    }

    /**
     *
     *
     * @return Maximum Sub Array sum of Size at most k
     */
    public static long kMaxSubarray(int n, int k, int arr[]) {
        // Code Here.
        long max_so_far=Long.MIN_VALUE,max_ending_here=0;
        int index=0;
        int low=0,high=n-1;
       while(low<high){
            max_ending_here+=arr[low];

           low++;
           index++;
            if(index<k) {
                if (max_so_far < max_ending_here)
                    max_so_far=max_ending_here;
                else if(max_ending_here<0) {
                    max_ending_here = 0;
                    index=0;

                }

            }else {
                System.out.println("HI");
                while(index>=0&&low-->=0&&max_ending_here>0){
                    max_ending_here-=arr[low];
                    if(max_so_far<max_ending_here)
                        max_so_far=max_ending_here;
                    index--;
                }
            }
           System.out.print(max_so_far + " ");

        }
        System.out.println();
       return max_so_far;
    }

    public static void printNos(int N)
    {
        //Your code here
        if(N<=0)
            return;
        printNos(N-1);
        System.out.print(N + " ");


    }
    public static <T> int count(T[] arr, T x){
        int count=0;
        for(T e: arr){
            if(e.equals(x))
                count++;
        }
        return count;
    }

    public static void main (String[] args) {
        int[] arr = {4,10,-3,3,9};
      //  System.out.println(minimizeArrayScore(arr.length,arr));
       // System.out.println(kMaxSubarray(arr.length,4,arr));
        printNos(10);
        Queue<?> c = new LinkedList<>();
        System.out.println(count(new Integer[]{1,2,3,4,5},3));
       List f = new ArrayList<>();
        f.add(1);
        f.add(2);
        List s = f;
        //s.add(1);
        //s.add(2);
        System.out.println(f==s);
        System.out.println(f.containsAll(Collections.singleton(new ArrayList<>().add(1))));
    }
}

package com.cleo.JBDL.collections;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {
    public static ArrayList<Integer> fillArrayList(int arr[], int n)
    {
        //Your code here
       ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }
        return list;
    }


    public static void add_to_ArrayList(ArrayList<Integer> A, int x)
    {
        //Your code here
        //Just add, don't print anything
        A.add(x);
    }

    public static void sort_ArrayList_Asc(ArrayList<Integer> A)
    {
        //Your code here
        //Just sort, don't print anything
        Collections.sort(A);
    }

    public static void reverse_ArrayList(ArrayList<Integer> A)
    {
        //Your code here
        //Just reverse, don't print anything
        Collections.reverse(A);
    }

    public static int size_Of_ArrayList(ArrayList<Integer> A)
    {
        //Your code here
        //Return the size of ArrayList
        return A.size();
    }

    public static void sort_ArrayList_Desc(ArrayList<Integer> A)
    {
        //Your code here
        //Just sort in desc order, don't print anything
        A.sort((x, y) -> y - x);
    }

    public static void print_ArrayList(ArrayList<Integer> A)
    {
        //Your code here
        //Print the elements of A, don't add new line
        A.forEach(x-> System.out.print(x + " "));
    }
    public static int minimum_vertical_sum(ArrayList<ArrayList<Integer>> arr)
    {
        //Your code here
        int sum=0,min_sum=Integer.MAX_VALUE;
        List<List<Integer>> sums = new ArrayList<>(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            sums.add(new ArrayList<>());
            for (int j = 0; j < arr.get(i).size(); j++) {
                sums.get(i).add(arr.get(j).get(i));
            }
        }
        for(var row:sums){
            sum=row.stream().reduce(0, Integer::sum);
            if(min_sum>sum)
                min_sum=sum;
        }

        return min_sum;

    }
    public static BigInteger fib(int n){

        //write your code here
        //return nth fibonacci number in BigInteger
        if(n<2)
            return BigInteger.valueOf(n);
        else{
            BigInteger a = BigInteger.ZERO;
            BigInteger b = BigInteger.ONE;
            for (int i = 1; i <n ; i++) {
                b=b.add(a);
                a=b.subtract(a);
            }
            return b;
        }


    }

    public static void main (String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);a.add(2);a.add(4);a.add(3);
        reverse_ArrayList(a);
        System.out.println(a);
        sort_ArrayList_Asc(a);
        System.out.println(a);
        sort_ArrayList_Desc(a);
        System.out.println(a);
        print_ArrayList(a);
        System.out.println(size_Of_ArrayList(a));
        System.out.println(fib(50));
    }
}

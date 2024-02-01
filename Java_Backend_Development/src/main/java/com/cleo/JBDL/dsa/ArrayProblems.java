package com.cleo.JBDL.dsa;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayProblems {
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[]) {
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

    private static boolean isPrime(int n){
        if(n%2==0)
            return false;
        for (int i =3 ; i <=n/2 ; i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }



    public static int nextPrime(int n){


        //code here to find next prime number
        //return next prime number
//        BigInteger bigInteger = BigInteger.valueOf(n);
//        BigInteger prime = bigInteger.nextProbablePrime();
//        return Integer.parseInt(String.valueOf(prime));

        if(n==1)
            return 2;

        while(true){
            if(isPrime(++n))
                return n;
        }




    }
    public static void countDigits(int n){

        //write your code here
        //print number of digits in n
        int count=0;
        while(n!=0){
            n/=10;
            count++;

        }
        System.out.println(count);

    }
    public static void triangleWall(int s){

        //Write your code here
        for (int i = 1; i <=s ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    /*
    Given an array of positive integers nums and an integer k,
     find the length of the longest subarray whose sum is less than or equal to k.
     */
    //nums = [3, 1, 2, 7, 4, 2, 1, 1, 5] and k = 8.
    public static int findLength(int[] nums, int k) {
        int left=0,right=0;
        int curr=0,length=0,max_length=0,answer=0;
        for (right = 0; right < nums.length; right++) {
            curr+=nums[right];
            //length++;
            if(max_length<length)
                max_length=length;
            while(curr>k){
                curr-=nums[left];
                left++;
            }
           // answer=Math.max(answer)

            length=Math.max(length,right-left+1);
        }
        return length;

    }

        public static void main (String[] args) {
        System.out.println(nextPrime(497));
        countDigits(10);
        triangleWall(4);
        int[] nums ={3, 1, 2, 7, 4, 2, 1, 1, 5};
        int k=8;
            System.out.println(findLength(nums,k));
        System.out.println(largestAndSecondLargest(3,new int[]{2,1,2}));
    }

}

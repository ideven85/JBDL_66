package com.cleo.JBDL.dsa;

public class LeetCode {

    public static int lengthOfLongestSubstring(String s) {

        StringBuilder sb = new StringBuilder();
        int length=0,max=0;
        for(char c: s.toCharArray()){
            if(sb.indexOf(String.valueOf(c))!=-1){
             //   System.out.print(sb+ " ");
                int index = sb.indexOf(String.valueOf(c));
                sb=new StringBuilder(sb.substring(index+1));//Time Complexity??
                //sb.append(c);


            }
                sb.append(c);
            if(max<sb.length())
                max= sb.length();



        }

        return max;

    }

    public static void main (String[] args) {
        System.out.println(lengthOfLongestSubstring("davidabcdef"));
    }
}

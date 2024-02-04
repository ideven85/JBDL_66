package com.cleo.JBDL.dsa;

import com.cleo.JBDL.multiThreading.A;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class LargestNumberPossible {

    static class StringComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            String first = o1+o2;
            String second = o2+o1;
            return second.compareTo(first);
        }
    }
    String printLargest(String[] arr) {
        // code here
        Object[] a=Arrays.stream(arr).sorted(new StringComparator()).toArray();
        StringBuilder sb = new StringBuilder();
        for(Object el:a)
            sb.append(el);
        return sb.toString();
    }

    public static void main(String[] args) {
        LargestNumberPossible largestNumberPossible = new LargestNumberPossible();
        int N = 4;
        String[] Arr = {"54", "546", "548", "60"};
        System.out.println(largestNumberPossible.printLargest(Arr));
    }
}

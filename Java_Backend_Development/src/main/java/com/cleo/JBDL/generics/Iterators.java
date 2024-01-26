package com.cleo.JBDL.generics;

import java.util.*;

public class Iterators {

    public static void removeEven(Collection<Integer> c){
        Iterator<Integer> it = c.iterator();
        while(it.hasNext()){
            int x = (Integer)it.next();
            if(x%2==0)
                it.remove();
        }
    }

    public static void main (String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(15);
        c.add(20);
        c.removeIf(n->n%2==0);
        removeEven(c);
        System.out.println(c);

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer[] arr = new Integer[list.size()];
      list.addAll(c);
        System.out.println(list);
      list.retainAll(c);
        System.out.println(list);

        List<Integer> al = Arrays.asList(1,2,3,4,5);
        al.stream()
                        .filter(x->x>=3)
                                .forEach(x-> System.out.print(x + " "));
        System.out.println();
     //   al.forEach(x-> System.out.print(x + " "));
       // System.out.println();
    }

}

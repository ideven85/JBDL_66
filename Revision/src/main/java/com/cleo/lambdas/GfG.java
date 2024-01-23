package com.cleo.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Interface with no parameters
 */

@FunctionalInterface
interface PrintInterface{
    void print();
}
@FunctionalInterface
interface PrintInteger{
    void print(int m);
}

interface Hello {
    public void sayHello();
}

interface Multiply {
    public int multiplyBy5(int n);
}
public class GfG {
    public static Multiply helperFunction1()
    {
        //Your code here
        //Implement the multiplyBy5(int n) method using lambda expression. The implemented function should return n*5
        return  (p) ->p*5;
      //  return multiply;
    }
    public static void multiply(int y){
        System.out.print(y);
    }
    public static void multiply(int x,int y){
        System.out.print(y);
    }
    public static Hello helperFunction()
    {
        //Your code here
        //Implement sayHello using lambda expression and return the object.
        //Write this in the lambda expression: System.out.println("Hello")
        Hello hello = () -> System.out.println("Hello");
        return () -> System.out.println("Hello");

    }
    static void fun(PrintInteger p, Integer m){
        p.print(m);
    }
    public static void main (String[] args) {
        PrintInterface p = () -> System.out.println("Hello");
        p.print();
        PrintInteger printInteger = System.out::println;
        fun(printInteger,10);
        System.out.println();
        //Point[] points = new SortedPoints[]{new SortedPoints((1,5),new Point(2,20),new Point(5,-3)};
        List<Point> points = new ArrayList<>();
        points.add(new SortedPoints(1,5));
        points.add(new SortedPoints(2,20));
        points.add(new SortedPoints(5,-3));
        points.add(new SortedPointsByXAxis(2,4));
        points=points.stream().sorted().collect(toList());
        List<Integer> list = Arrays.asList(1,2,3,4);
        list.forEach(GfG::multiply);
        Point[] p1 = new Point[3];
        p1[0] = new SortedPoints(0,1);

        p1[1]=new SortedPoints(1,2);
        //p1[1].y=3;
        Arrays.sort(p1,(p11,p2)->p11.x-p2.y);
        System.out.println(Arrays.toString(p1));
//        System.out.println(Arrays.toString(points));
//        Arrays.sort(points,(p1,p2)->p1.x-p2.x);
//        System.out.println(Arrays.toString(points));
//        Arrays.sort(points,(p1,p2)->p2.y-p1.y);
//        System.out.println(Arrays.toString(points));
        System.out.println(points);
        helperFunction().sayHello();

    }
}

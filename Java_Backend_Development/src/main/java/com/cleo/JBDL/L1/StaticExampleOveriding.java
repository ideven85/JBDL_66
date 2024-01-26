package com.cleo.JBDL.L1;

class Parent1{
    public static  void m1(){
        System.out.println(" this is parent class static ");
    }
}
class Child1 extends Parent1{
    public static  void m1(){
        System.out.println(" this is child  class static ");
    }
}

public class StaticExampleOveriding {
    public static void main(String[] args) {

        Parent1 p1= new Parent1();

        Parent1.m1();
        Child1 c= new Child1();

        Parent1 p2= new Child1();




    }
}

package com.cleo.JBDL.collections;

public class MyClass {
    MyClass m;
    boolean b;
static     int a=10;


    public void display(){
        System.out.println("Hello World");
    }
    public MyClass(){
        this(2,3);
    }
    public void setA(int a){
        a=20;
    }
    public MyClass(int first, int second){
        //this(2,3);

        System.out.println("first:"+first);
        System.out.println("second:" + second);
    }
    MyClass print(){
       // return this;
        return this;
    }

    public static void main (String[] args) {

        MyClass second = new MyClass();
        /*System.out.println(second.b);
        System.out.println(second.m);
        System.out.println(second.a);*/
second.setA(30);
        System.out.println(MyClass.a);
        second.print().print();
        second.print().toString();

    }
}

package com.cleo.JBDL.multiThreading;

public class A extends Thread{

    public A(String name){

        super(name);
    }
    public A(){
        this("A");
    }
    public void run(){
        for (int i = 1; i <=5 ; i++) {
            System.out.println("We are in thread: " + Thread.currentThread().getName() + " i=" + i);
        }
    }
}

class B implements Runnable{
    @Override
    public void run () {
        for (int i = 6; i <=10 ; i++) {
            System.out.println("We are in thread: " + Thread.currentThread().getName() + " i=" + i);
        }
    }
}
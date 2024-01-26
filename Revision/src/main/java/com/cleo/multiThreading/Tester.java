package com.cleo.multiThreading;

public class Tester {
    public static void main (String[] args) {
        Thread t1 = new A();
        t1.start();
        B temp = new B();
        Thread m = new Thread(temp,"Temp_Thread");
        m.start();
        temp.run();
        for (int i = 1; i <=5 ; i++) {
            System.out.println(Thread.currentThread().getName() + " i=" + i);
        }
    }
}

package com.cleo.JBDL.multiThreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Tester {

    private static Integer f(int x){
        return Integer.valueOf(x*2);
    }
    private static Integer g(int x){
        return Integer.valueOf(x+1);
    }
    
    public static void main (String[] args) throws ExecutionException, InterruptedException{
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        
        /*
         * Calling Future based Threads
         */
        int x = 1337;

         Future<Integer> f1 = executorService.submit(()->f(x));
         Future<Integer> f2 = executorService.submit(()->g(x));
         System.out.println( f1.get() + f2.get());

        Thread t1 = new A();
        t1.setPriority(7);
        t1.start();
        B temp = new B();
        Thread m = new Thread(temp,"B");
        m.setPriority(2);

        m.start();
        temp.run();
        executorService.shutdown();
        for (int i = 1; i <=5 ; i++) {
            System.out.println(Thread.currentThread().getName() + " i=" + i);
        }
    }
}

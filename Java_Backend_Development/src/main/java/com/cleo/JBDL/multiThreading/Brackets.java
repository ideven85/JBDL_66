package com.cleo.JBDL.multiThreading;

public class Brackets {
    public  void printBrackets(char open, char closing){
            synchronized (this) {
                for (int i = 0; i < 10; i++) {
                    if (i < 5)
                        System.out.print(open);
                    else
                        System.out.print(closing);

                }
                System.out.println();
            }

        try {
           Thread.sleep(1000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }
}
class Sync{
    public static void main (String[] args) {
        Brackets brackets = new Brackets();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run () {
                long start = System.currentTimeMillis();

                for (int i = 0; i < 5; i++) {
                    brackets.printBrackets('(',')');
                }
                long end = System.currentTimeMillis();
                System.out.println("Time Taken: " + (end-start));

            }

        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run () {
                long start = System.currentTimeMillis();

                for (int i = 0; i < 5; i++)
                    brackets.printBrackets('[',']');
                long end = System.currentTimeMillis();
                System.out.println("Time Taken: " + (end-start));

            }
        });
        t1.start();
        t2.start();
    }
}
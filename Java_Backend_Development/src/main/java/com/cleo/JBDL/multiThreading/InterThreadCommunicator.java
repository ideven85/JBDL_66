package com.cleo.JBDL.multiThreading;

public class InterThreadCommunicator {
    int buffer;

    /*
    Flag false indicates consumer is consuming the item
     */
    boolean flag=false;
    public synchronized void produce_item(int item) throws InterruptedException{
        if(flag){
            wait();
        }
        this.buffer=item;
        flag=true;
        notify();
        System.out.println("Produced item: " + item);
    }
    public synchronized int consume_item() throws InterruptedException{
        if(!flag)
            wait();
        System.out.println("Consumed item: " + buffer);
        flag=false;
        notify();
        return buffer;

    }
}

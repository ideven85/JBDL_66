package com.cleo.JBDL.multiThreading;

public class Consumer extends Thread{

    InterThreadCommunicator communicator;

    public Consumer (InterThreadCommunicator communicator) {
        this.communicator = communicator;
    }

    @Override
    public void run(){
        while(true){
            try {
           int item= communicator.consume_item();

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

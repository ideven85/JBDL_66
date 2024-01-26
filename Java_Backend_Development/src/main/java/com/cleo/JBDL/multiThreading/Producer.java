package com.cleo.JBDL.multiThreading;

public class Producer extends Thread {

    InterThreadCommunicator communicator;

    public Producer (InterThreadCommunicator communicator) {
        this.communicator = communicator;
    }

    @Override
    public void run () {
        int i=1;
        while(true){
            try {
            communicator.produce_item(i++);


                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package com.cleo.JBDL.multiThreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Producer_Consumer_Main {

    public static void main (String[] args) {
        InterThreadCommunicator communicator = new InterThreadCommunicator();
        Producer producer = new Producer(communicator);
        int[] arr = {1,2,3,4};
        System.out.println((float) Arrays.stream(arr).filter(e->e%2==0).sum());
        producer.setPriority(7);
        Consumer consumer = new Consumer(communicator);
        producer.start();
        consumer.start();

    }
}

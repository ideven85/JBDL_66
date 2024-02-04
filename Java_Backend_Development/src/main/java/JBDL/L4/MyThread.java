package JBDL.L4;

public class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("This code is running in "+Thread.currentThread().getName());
    }

}

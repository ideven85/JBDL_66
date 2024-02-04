package JBDL.L4;

public class VolatileThread extends Thread{

    private volatile boolean stop=false;


    @Override
    public void run(){
        while (!stop){
            System.out.println("Running in "+Thread.currentThread().getName());
        }
    }

    public void stopRunning(){
        stop = true;
    }

}

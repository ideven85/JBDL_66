package JBDL.L3;

public class Threads {

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("Total memory available to JVM "+           Runtime.getRuntime().totalMemory()/(1024*1024));
        System.out.println("Total bytes of memory used by JVM : "+ (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1024/1024);
        System.out.println(Runtime.getRuntime().freeMemory()/1024);
        var env = System.getenv();
        for(var el:env.entrySet())
            System.out.println(el.getKey()+":"+el.getValue());

    }
}

class GFG {
    public static void main (String[] args) throws InterruptedException{
        System.out.println("In main function, thread is " +
                Thread.currentThread().getName());


        System.out.println("Invoking a new thread....");
        MyThread thread = new MyThread();
        thread.start();


        System.out.println("New thread is started .....");
        thread.join();
    }
}

class MyThread extends Thread{

    /*public MyThread(String name){
        super(name);
    }*/
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("In run function, thread is " + Thread.currentThread().getName());
    }
}
package JBDL.L3;


import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static java.lang.Math.sqrt;
import static java.util.stream.LongStream.rangeClosed;

class ThreadImplementingRunnable extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("child thread");
        }
    }
}
class TestThread{
    public static void main(String[] args) throws InterruptedException{
        ThreadImplementingRunnable t = new ThreadImplementingRunnable();
       t.setPriority(10);
        t.start();
       // t.join();
        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
        }
    }
}
public class ThreadDemo extends Thread{
    final int PARALLESIM=20;
    ForkJoinPool forkJoinPool=null;
    public static boolean isPrime(long n){
        return n>1 && rangeClosed(2,(long)sqrt(n))
                .noneMatch(divisor->n%divisor==0);
    }

    public static String factorial(int n){
        BigInteger f = BigInteger.ONE;
        for (int i = 2; i <=n ; i++) {
            BigInteger x = BigInteger.valueOf(i);
            f=f.multiply(x);
        }
        return f.toString();
    }
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
    public void test(){
        try{
            forkJoinPool = new ForkJoinPool();
            final List<String> factorials = forkJoinPool.submit(()->
                    IntStream.range(1,10000)
                            //.parallel()
                            .mapToObj(ThreadDemo::factorial)

                            .toList()
            ).get();
            System.out.println("Factorials:");
            factorials.forEach(System.out::println);
        }catch (InterruptedException | ExecutionException e){
            throw new RuntimeException(e);
        }finally {
            if(forkJoinPool!=null)
                forkJoinPool.shutdown();
        }
    }

    public static void main(String[] args) {
        ThreadDemo demo = new ThreadDemo();
        demo.start();
        ThreadImplementingRunnable runnable = new ThreadImplementingRunnable();
        runnable.run();
        long start = System.currentTimeMillis();
        demo.test();
        System.out.println("Done: Time Taken");
        System.out.println(System.currentTimeMillis()-start);
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(ForkJoinPool.commonPool().getParallelism());
        System.out.println(ForkJoinPool.getCommonPoolParallelism());
    }


}

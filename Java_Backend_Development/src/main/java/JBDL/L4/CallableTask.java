package JBDL.L4;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        // API to indogo
        // processing
        return "Returning data from "+Thread.currentThread().getName();
    }
}

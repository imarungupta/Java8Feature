package FututeObjectDisadvantaveOverCompletableFuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiFutureCannotChainedTogether {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long start1=0;
        long end1=0;
        ExecutorService service= Executors.newFixedThreadPool(10);
        start1=System.currentTimeMillis();
        Future<List<Integer>> submit = service.submit(() -> {
            System.out.println("Thread: " + Thread.currentThread().getName());
            //delay(min:1);
            return Arrays.asList(1, 2, 3, 4);
        });
        end1=System.currentTimeMillis();
        // Note here inside submit() it takes Callable Interface Implementation :
        // Submits a value-returning task for execution and returns a Future representing the pending results of the task.
        // The Future's get method will return the task's result upon successful completion.
        // The above thread will be not completed until we call Future's get() method
        List<Integer> integers = submit.get(); // Returns the list of integers
        System.out.println(integers);
        System.out.println("Time taken by sequential stream:"+ (end1-start1)+"ms");
        // Note: Above we commented delay(min: 1); If we enable this, then the below line will be executed after one min
        // and we cannot execute or complete the above execution forcefully.
        // So this is the one disadvantage of Future object over CompletableFuture Object.

        // Note2- If we want to list integer output as an input for another future object then we cannot do this

    }
}

package FututeObjectDisadvantaveOverCompletableFuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleFutureObjectCannotCombineToFinalResult {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service= Executors.newFixedThreadPool(10);

        Future<List<Integer>> future1 = service.submit(() -> {
            System.out.println("Thread: " + Thread.currentThread().getName());
            return Arrays.asList(1, 2, 3, 4);
        });
        Future<List<Integer>> future2 = service.submit(() -> {
            System.out.println("Thread: " + Thread.currentThread().getName());
            return Arrays.asList(1, 2, 3, 4);
        });
        Future<List<Integer>> future3 = service.submit(() -> {
            System.out.println("Thread: " + Thread.currentThread().getName());
            return Arrays.asList(1, 2, 3, 4);
        });

        List<Integer> integers = future1.get(); // Returns the list of integers
        List<Integer> integers1 = future2.get();
        List<Integer> integers2 = future3.get();
// As we can see that each Future object can run seperately but cannot executed as combine together like
        // future1.get() + future2.get() + future3.get();
        System.out.println(integers +"-"+ integers1 +"-"+ integers2);


    }
}

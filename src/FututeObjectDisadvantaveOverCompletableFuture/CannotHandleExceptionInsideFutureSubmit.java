package FututeObjectDisadvantaveOverCompletableFuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CannotHandleExceptionInsideFutureSubmit {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(10);

        Future<List<Integer>> future1 = service.submit(() -> {
            System.out.println("Thread: " + Thread.currentThread().getName());
            System.out.println(10/0); // Raised Exception here
            return Arrays.asList(1, 2, 3, 4);
        });
        List<Integer> integers = future1.get(); // Returns the list of integers
        System.out.println(integers);

        // Note: AS we can see that we have raised one exception but there is no facility to handle this exception
        // i.e. if any exception occurs then 100% it is going to terminate the program abnormally
    }
}

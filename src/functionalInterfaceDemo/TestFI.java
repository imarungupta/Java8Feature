package functionalInterfaceDemo;

import lambdaexpression.MyFunctionalInterface;
import org.omg.Messaging.SyncScopeHelper;

import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestFI {
    public static void main(String[] args) {
//        Runnable runnable;
//        Callable callable;
//        Comparable comparable;
//        Comparator comparator;
//        Function function;
//        Predicate predicate;
//        Consumer consumer;
//        Supplier supplier;
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("This is the normal runnable method");
            }
        };
        new Thread(runnable).start();

        // The equivalent lambda expression to the above method
        Runnable runnable1 = () -> System.out.println("This is the normal runnable method");
        new Thread(runnable1).start();

        Function<Integer,String> function=(t)-> "output::"+t;
        System.out.println(function.apply(88));
    }




}

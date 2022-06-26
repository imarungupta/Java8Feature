package lambdaexpression;

import org.omg.Messaging.SyncScopeHelper;

import java.util.function.Function;

public class TestLambdaExp {
    public static void main(String[] args) {
        // Using old way to call interface method
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        System.out.println(addTwoNumbers.add(5,6));

        // Using lambda expression
       MyFunctionalInterface addTwo= (a,b)->{
           return a+b;
       };
        int i = addTwo.add(3, 5);
        System.out.println(i);

        Function<Integer,String> function=(t)-> "output"+t;
        function.apply(88);
    }
}

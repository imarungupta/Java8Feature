package functionalInterfaceDemo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
public interface UPIPaymentFI {
    public abstract String doPayment(String source, String destination);
    //public abstract String test();
    // Since FI can have only one abstract method that is why comment another abstract method test()

    // But we can define multiple default and static method
    default double method1(){
        return new Random().nextDouble();
    }
    default int method2(){
        return new Random().nextInt();
    }
    default String method3(){
        return "We can modify this default method into its implementation class";
    }
    static String datePattern(String pattern){
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(new Date());
    }
    static String datePattern2(String pattern){
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(new Date());
    }
    // We can have multiple static method as well which can be used as utility methods
}

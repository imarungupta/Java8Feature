package functionalInterfaceDemo;

import java.util.Random;

public class Paytm implements UPIPaymentFI{

    @Override
    public String doPayment(String source, String destination) {
        String paytmTnxDateTime = UPIPaymentFI.datePattern("yyyy-dd-mm");
        return paytmTnxDateTime;
    }
    // We can see that abstract method is forced to implement and here we have taken
    // datePattern from static method Working as utility class. But as we can see
    // that it is not forcing to implement all default and static method
    @Override
    public double method1() {
        return UPIPaymentFI.super.method1();
    }
    @Override
    public String method3() {
        //return UPIPaymentFI.super.method2();
        return "Implement this method based on our need";
    }
}

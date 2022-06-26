package functionalInterfaceDemo;

public class AmazonPay implements UPIPaymentFI{
    @Override
    public String doPayment(String source, String destination) {
        String amazonTnxDatetime = UPIPaymentFI.datePattern2("dd-mm-yyyy");
        return amazonTnxDatetime;
    }
    @Override
    public int method2() {
        return 10000;
    }
}

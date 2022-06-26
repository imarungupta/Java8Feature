package functionalInterfaceDemo.addTwoNum;

public class ImplementAddTwoNum implements TwoNumAdition{
    @Override
    public void addTwoNumber(int a, int b) {
        System.out.println("The Addition of two numbers:"+ a+b);
    }
}

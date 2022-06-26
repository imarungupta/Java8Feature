package javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
public static void main(String[] args) {
List<Integer> numbersList= Arrays.asList(23,5,55,9,15,63,4);

// Step1- First convert the Collection into stream()
Stream<Integer> listStream = numbersList.stream();
// Step2- apply stream methods on the collection stream object
System.out.println("without sorting");
listStream.filter(t-> t>5).forEach(System.out::println);
//listStream.sorted().filter(t->t>5).forEach(System.out::println);
// because of the above line we will get exception
Stream<Integer> listStream1 = numbersList.stream();
// Step2- now apply another stream method sort()
System.out.println("Sorted list ");
//listStream1.sorted().filter(t->t>5).forEach(System.out::println);
//listStream1.sorted().filter(t->t>5).forEach(StreamExample::printNumbers);
    StreamExample test = new StreamExample();
listStream1.sorted().filter(t->t>5).forEach(test::printNumber1);

}
public static void printNumbers(int i){
    System.out.println("The sorted number is : "+i);
}
    // Normal concreate method
    public void printNumber1(int i){
        System.out.println(" Called by using method reference:"+i);
    }
}

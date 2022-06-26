package SeqVsParallelStream;

import java.util.stream.IntStream;

public class SeqVsPrelExample2 {
public static void main(String[] args){
System.out.println("====Sequential Stream======");
IntStream.rangeClosed(1,5).forEach(t-> System.out.println(Thread.currentThread().getName()+ t));
System.out.println("====Parallel Stream======");
IntStream.rangeClosed(1,5).parallel().forEach(t-> System.out.println(Thread.currentThread().getName() +"-" + t));
}
}

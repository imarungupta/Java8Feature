package SeqVsParallelStream;

import java.util.Arrays;
import java.util.List;

public class TestSeqVsParallelStream {
public static void main(String[] args){
    long start1=0;
    long end1=0;
    long start2=0;
    long end2=0;

    List<Integer> integerList = Arrays.asList(1,2,3,4,5);
    System.out.println("======Sequential Stream ============");
    start1=System.currentTimeMillis();
    integerList.stream().forEach(i-> System.out.println(i));
    end1=System.currentTimeMillis();
    System.out.println("Time taken by sequential stream:"+ (end1-start1)+"ms");
    System.out.println("======Parallel Stream ============");
    start2= System.currentTimeMillis();
    integerList.stream().parallel().forEach(i-> System.out.println(i));
    end2= System.currentTimeMillis();
    System.out.println("Time taken by parallel Stream:"+ (end2-start2) +"ms");
}
}

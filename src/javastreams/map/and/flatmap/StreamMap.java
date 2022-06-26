package javastreams.map.and.flatmap;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

public static void main(String[] args) {
	List<Integer> marks = new ArrayList<Integer>();
	marks.add(100);
	marks.add(200);
	marks.add(300);
	marks.add(400);
	marks.add(500);
	System.out.println(marks);
	List<Integer> graceMarks = marks.stream().map(i -> i + 5).collect(Collectors.toList());
	System.out.println(graceMarks);
}
}

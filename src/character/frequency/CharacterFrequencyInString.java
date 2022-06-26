package character.frequency;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class CharacterFrequencyInString {
    public static void main(String[] args) {
        String input = "arunkumargupta";
        // 1- Convert the string into Stream array and then split with ""
        // 2- Now collect this stream and inside this Using groupingBy find each character and count it
        Map<String, Long> collect = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );
        System.out.println(collect);
    }
}

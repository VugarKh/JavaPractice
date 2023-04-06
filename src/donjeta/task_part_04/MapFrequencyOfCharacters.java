package donjeta.task_part_04;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFrequencyOfCharacters {
    // Program to create a frequency map in Java 8 and above
    public static void main(String[] args) {

        String str = "Collections";
        System.out.println(frequencyOfCharacters(str));


    }

    public static Map<String, Long> frequencyOfCharacters(String word) {

        String[] chars = word.split("");

        // String [] chars = { "A", "B", "C", "A", "C", "A" };

        Map<String, Long> freq = Stream.of(chars).collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));

        return freq;
    }
}

package Java_8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "java is good java is powerful";

        Map<String, Long> wordCount =
                Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(wordCount);
    }
}

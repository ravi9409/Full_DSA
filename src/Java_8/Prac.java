package Java_8;

import java.util.List;
import java.util.stream.Collectors;

public class Prac {
    public static void main(String[] args) {
        List<String> names = List.of("ravi", "amit", "john");

        List<Integer> lengths = names.stream()
                .map(name -> name.length())
                .collect(Collectors.toList());

        System.out.println(lengths);
    }
}

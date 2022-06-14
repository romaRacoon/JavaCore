import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {;
        new BufferedReader(new InputStreamReader(System.in)).lines()
                .map(l -> l.toLowerCase().replaceAll("\\p{Punct}"," ").split("\\s+"))
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Comparator.comparing((Function<Map.Entry<String, Long>, Long>) Map.Entry::getValue)
                        .reversed())
                .map(n -> n.getKey()).limit(10)
                .forEach(System.out::println);
    }
}

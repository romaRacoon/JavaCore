import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stream<String> stream = scanner.tokens().flatMap(s -> Arrays.asList(s.split("-")).stream())
                .filter(w -> w.length() > 0)
                .map(String::toLowerCase);
        Map<String, Long> map = stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> {
                            throw new IllegalStateException();
                        },
                        LinkedHashMap::new
                ));

        for (String s : map.keySet()) {
            System.out.println(s + "=" + map.get(s));
        }
    }
}

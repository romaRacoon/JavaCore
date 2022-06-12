import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
    }
    public <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<?> elements = stream.sorted(order).toList();
        if (elements.size() == 0) {
            minMaxConsumer.accept(null, null);
        } else {
            minMaxConsumer.accept((T) elements.get(0), (T) elements.get(elements.size() - 1));
        }
    }
}

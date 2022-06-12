import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
    }
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> ((n * n) / 10) % 1000);
    }
}

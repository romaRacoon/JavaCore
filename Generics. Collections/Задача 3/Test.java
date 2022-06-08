import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        System.out.println(i);
        String s = pair.getSecond(); // "hello"
        System.out.println(s);
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        System.out.println(mustBeTrue);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(mustAlsoBeTrue);
    }
    public static class Pair<T, S> {
        private T first;
        private S second;

        private Pair(T first, S second) {
            this.first = first;
            this.second = second;
        }
        public static <T, S> Pair <T, S> of(T first, S second) {
            return new Pair<>(first, second);
        }
        public T getFirst() {
            return first;
        }
        public S getSecond() {
            return second;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            return obj instanceof Pair<?,?> other
                    && Objects.equals(first, other.getFirst())
                    && Objects.equals(second, other.getSecond());
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(first) + Objects.hashCode(second);
        }
    }
}

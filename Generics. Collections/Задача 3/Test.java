import java.util.*;
import java.util.function.UnaryOperator;

public class Test {
    public static void main(String[] args) {

    }
    public static class Pair<T, S> {
        private T first;
        private S second;

        private Pair(T first, S second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public S getSecond() {
            return second;
        }

        public static <T, S> Pair<T, S> of(T first, S second) {
            return new Pair<>(first, second);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if ((o instanceof Pair<?, ?>) == false) {
                return false;
            }
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
        }

        @Override
        public int hashCode() {
            int result = 31;

            if (first != null) {
                result = result * 17 + first.hashCode();
            }
            if (second != null) {
                result = result * 17 + second.hashCode();
            } else if (first == null) {
                return 0;
            }
            return result;
        }
    }
}

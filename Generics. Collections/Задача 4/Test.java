import java.util.*;
import java.util.function.UnaryOperator;

public class Test {
    public static void main(String[] args) {

    }
    public static class DynamicArray<T> {
        private int size = 0;
        private static final double DEFAULT_LOAD = 0.75;
        private T[] array = (T[]) new Object[10];

        public void add(T el) {
            if (size >= array.length * DEFAULT_LOAD) {
                array = Arrays.copyOf(array, array.length * 2);
            }
            array[size++] = el;
        }

        public void remove(int index) {
            if (checkIndex(index)) {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.arraycopy(array, index + 1, array, index, array.length - index - 1);
            size--;
        }

        public T get(int index) {
            if (checkIndex(index)) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                return array[index];
            }
        }

        private boolean checkIndex(int index) {
            return index >= size || index < 0;
        }
    }
}

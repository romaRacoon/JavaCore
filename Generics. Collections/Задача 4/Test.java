import java.util.Objects;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
        array.remove(7);
        array.remove(7);
        array.remove(7);
        array.add(0);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);

        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
    }
    public static class DynamicArray<T> {
        private T[] array = (T[]) new Object[0];
        private int amountNullableElements = array.length;
        private int addedIndex = 0;

        public DynamicArray() {
        }

        public void add(T el) {
            if (amountNullableElements > 0) {
                array[addedIndex] = el;
                amountNullableElements--;
            } else {
                T[] tempArray = (T[]) new Object[array.length + 1];
                for (int i = 0; i < array.length; i++) {
                    tempArray[i] = array[i];
                }
                tempArray[array.length] = el;
                array = tempArray;
            }
        }

        public T get(int index) {
            if (index >= array.length || index < 0) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                return array[index];
            }
        }

        public void remove(int index) {
            T[] tempArray = (T[]) new Object[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) {
                    tempArray[j++] = array[i];
                }
            }
            array = tempArray;
        }
    }
}

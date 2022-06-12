import java.io.Reader;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            scanner.next();
            if (scanner.hasNextInt()) {
                deque.addFirst(scanner.nextInt());
            }
        }
        for (Integer value : deque) {
            System.out.print(value + " ");
        }
    }
}

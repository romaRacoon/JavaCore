import java.util.*;

public class Test {
    public static void main(String[] args) {
        int counter = 1;
        Deque<Integer> deque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            scanner.next();
            if (scanner.hasNextInt()) {
                if (counter % 2 == 0) {
                    deque.add(Integer.parseInt(String.valueOf(scanner.next())));
                }
                counter++;
            }
        }
        for (Integer value : deque) {
            System.out.print(value + " ");
        }
    }
}

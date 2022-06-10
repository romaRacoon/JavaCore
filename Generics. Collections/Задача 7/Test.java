import java.util.*;

public class Test {
    public static void main(String[] args) {
        int counter = 1;
        String input = "";
        Deque<Integer> deque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            input = scanner.next();
            if (counter % 2 == 0) {
                deque.addFirst(Integer.parseInt(input));
            }
            counter++;
        }
        for (Integer value : deque) {
            System.out.print(value + " ");
        }
    }
}

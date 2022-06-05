import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<String>();
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            numbers.add(input.trim());
        }
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += Double.parseDouble(numbers.get(i));
        }
        System.out.printf("%f", sum);
    }
}

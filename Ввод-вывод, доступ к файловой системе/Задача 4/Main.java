import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double amount = 0;
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            String[] numbers = input.split("\s");
            for (int i = 0; i < numbers.length; i++) {
                try {
                    amount += Double.parseDouble(numbers[i]);
                } catch (Exception e) {

                }
            }
        }
        System.out.printf("%.6f", amount);
    }
}

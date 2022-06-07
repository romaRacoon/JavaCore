import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double amount = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                amount += Double.parseDouble(scanner.next());
            } else {
                scanner.next();
            }
        }
        System.out.printf("%.6f", amount);
    }
}

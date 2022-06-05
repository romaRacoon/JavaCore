import java.util.*;

public class Main {
    public static void main(String[] args) {
        double sum = 0;
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            while (scanner.hasNext()) {
                String input = scanner.nextLine();
            }
        } catch (Exception e) {
            System.out.printf("%f", 0);
        }
        System.out.printf("%.6f", sum);
    }
}

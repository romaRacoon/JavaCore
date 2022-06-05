import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<String>();
        while (scanner.hasNext()) {
            String input = scanner.nextLine().trim();
            numbers.add(input);
        }
        double sum = 0;
        if (numbers.size() == 1) {
            String[] stringNumbers = numbers.get(0).split("\s");
            for (int i = 0; i < stringNumbers.length; i++) {
                try {
                    sum += Double.parseDouble(stringNumbers[i]);
                } catch (Exception e) {
                }
            }
        } else {
            for (int i = 0; i < numbers.size(); i++) {
                try {
                    sum += Double.parseDouble(numbers.get(i));
                } catch (Exception e){
                }
            }
        }
        System.out.printf("%f", sum);
    }
}

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Double> trueNumbers = new ArrayList<Double>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        
    }
    private static String[] getAllNumbers(String input) {
        String[] numbers = input.split("\s");
        return numbers;
    }
    private static boolean isInputWithoutLetter(String input) {
        int index = input.indexOf("\\w");
        if (index != -1) {
            return input.charAt(index) == '.';
        } else {
            if (findLetter(input)) {
                return false;
            } else {
                return true;
            }
        }
    }
    private static boolean checkAllNumbersWithoutLetter(String[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (isInputWithoutLetter(numbers[i]) == false) {
                return false;
            }
        }
        return true;
    }
    private static void getSum(ArrayList<Double> trueNumbers) {
        double sum = 0;
        for (int i = 0; i < trueNumbers.size(); i++) {
            sum += trueNumbers.get(i);
        }
        String number = Double.toString(sum);
        int amount = new BigDecimal(number).scale();
        if (amount == 6) {
            System.out.println(sum);
        } else if (amount < 6) {
            for (int i = 0; i < 6 - amount; i++) {
                number += "0";
            }
            System.out.println(number);
        }
    }
    private static boolean findLetter(String input) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < alphabet.length(); j++) {
                if (input.toLowerCase().charAt(i) == alphabet.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}

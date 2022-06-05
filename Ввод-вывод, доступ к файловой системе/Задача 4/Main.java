import java.io.*;
import java.nio.*;
import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Double> trueNumbers = new ArrayList<Double>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String[] numbers = getAllNumbers(input);
        if (checkAllNumbersWithoutLetter(numbers) == false) {
            System.out.println("0.000000");
            System.exit(0);
        } else {
            for (int i = 0; i < numbers.length; i++) {
                trueNumbers.add(Double.parseDouble(numbers[i]));
            }
            getSum(trueNumbers);
        }
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
        System.out.println(sum);
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

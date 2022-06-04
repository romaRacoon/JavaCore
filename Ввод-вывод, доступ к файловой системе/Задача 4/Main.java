import java.io.*;
import java.nio.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String[] numbers = getAllNumbers(input);
    }
    private static String[] getAllNumbers(String input) {
        String[] numbers = input.split("\s");
        return numbers;
    }
    private static boolean isInputWithoutLetter(String input) {
        return input.indexOf("\\w") == -1;
    }
    private static boolean checkAllNumbersWithoutLetter(String[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (isInputWithoutLetter(numbers[i])) {
                //Тут должен выводится нулевой дабл
                return false;
            }
        }
        return true;
    }
}

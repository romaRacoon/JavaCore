import java.math.BigInteger;

public class Task {
    public static void main(String[] args) {
        System.out.println(factorial(0));
    }
    public static BigInteger factorial(int value) {
        if (value <= 1) {
            return new BigInteger(Integer.toString(1));
        } else {
            return BigInteger.valueOf(value).multiply(factorial(--value));
        }
    }
}
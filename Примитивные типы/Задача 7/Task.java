import java.math.BigInteger;

public class Task {
    public static void main(String[] args) {
        System.out.println(factorial(0));
    }
    public static BigInteger factorial(int value) {
        if (value == 0){
            return new BigInteger("1");
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
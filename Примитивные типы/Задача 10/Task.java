import java.math.BigInteger;

public class Task {
    public static void main(String[] args) {
        int[] arr = {-3,25,87,101};
        printOddNumbers(arr);
    }
    public static void printOddNumbers(int[] arr) {
        boolean isFirst = false;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) % 2 != 0) {
                if (isFirst == false) {
                    System.out.print(arr[i]);
                    isFirst = true;
                } else {
                    System.out.print("," + arr[i]);
                }
            }
        }
        System.out.println();
    }
}
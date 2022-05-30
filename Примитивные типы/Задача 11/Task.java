import java.math.BigInteger;

public class Task {
    public static void main(String[] args) {

    }
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] sortedArray = new int[a1.length + a2.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < sortedArray.length; k++) {
            if (i > a1.length - 1) {
                int a = a2[j++];
                sortedArray[k] = a;
            } else if (j > a2.length - 1) {
                int a = a1[i++];
                sortedArray[k] = a;
            } else if (a1[i] < a2[j]) {
                int a = a1[i++];
                sortedArray[k] = a;
            } else {
                int b = a2[j++];
                sortedArray[k] = b;
            }
        }

        return sortedArray;
    }
}
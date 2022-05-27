public class Task {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-2));
    }
    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }
}

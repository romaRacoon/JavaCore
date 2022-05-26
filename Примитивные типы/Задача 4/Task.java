public class Task {
    public static void main(String[] args) {
        Task task = new Task();
    }
    public static boolean isPowerOfTwo(int value) {
        while (Math.abs(value) != Math.abs(1) && Math.abs(value) % 2 == 0){
            value /= 2;
        }

        if(value == Math.abs(1)){
            return true;
        }
        else{
            return false;
        }
    }
}

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

    }
    public int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        while (inputStream.available() != 0) {
            int number = inputStream.read();
            sum += (byte) number;
        }
        return sum;
    }
}

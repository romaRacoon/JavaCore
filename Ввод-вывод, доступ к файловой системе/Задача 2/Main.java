import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {

    }
    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        while (inputStream.available() != 0) {
            int number = inputStream.read();
            if (number % 2 == 0) {
                outputStream.write(number);
            }
        }
        outputStream.flush();
    }
}

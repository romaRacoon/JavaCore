import java.io.*;

public class Test {

    public static void main(String[] args) {

    }
    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bytes = inputStream.readAllBytes();
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] % 2 == 0) {
                outputStream.write(bytes[i]);
            }
        }
        outputStream.flush();
    }
}

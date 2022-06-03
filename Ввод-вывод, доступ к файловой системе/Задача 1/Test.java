import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        byte[] input = {1, 2, 4, 10, -1};
        InputStream inputStream = new ByteArrayInputStream(input);
        int result = 0;
        try {
            result = test.sumOfStream(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(result);
    }
    public int sumOfStream(InputStream inputStream) throws IOException {
        byte[] bytes = inputStream.readAllBytes();
        int sum = 0;
        for (int i = 0; i < bytes.length; i++) {
            sum += bytes[i];
        }
        return sum;
    }
}

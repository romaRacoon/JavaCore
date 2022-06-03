import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Test {

    public static void main(String[] args) {
        byte[] bytes = {48, 49, 50, 51};
        try {
            System.out.println(readAsString(new ByteArrayInputStream(bytes), StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        final int bufferSize = 1024;
        final char[] buffer = new char[bufferSize];
        final StringBuilder out = new StringBuilder();
        try (Reader in = new InputStreamReader(inputStream, charset)) {
            for (; ; ) {
                int rsz = in.read(buffer, 0, buffer.length);
                if (rsz < 0)
                    break;
                out.append(buffer, 0, rsz);
            }
            return out.toString();
        }
    }
}

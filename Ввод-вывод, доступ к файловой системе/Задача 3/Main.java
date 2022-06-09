import java.io.*;
import java.nio.charset.Charset;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

    }
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        StringBuilder strB = new StringBuilder();
        int i;
        while ((i = inputStreamReader.read()) != -1) {
            strB.append((char) i);
        }
        return strB.toString();
    }
}

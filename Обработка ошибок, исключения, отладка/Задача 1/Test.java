import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

    }

    public void testExp() throws MyNewException {
        throw new MyNewException();
    }

    public static class MyNewException extends Exception {

    }
}

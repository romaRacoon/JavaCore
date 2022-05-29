import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

    }
    public static class AsciiCharSequence implements CharSequence{
        private byte[] symbols;

        public AsciiCharSequence(byte[] symbols) {
            this.symbols = symbols;
        }

        @Override
        public int length() {
            return symbols.length;
        }

        @Override
        public char charAt(int index) {
            return (char) symbols[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            return new AsciiCharSequence(Arrays.copyOfRange(symbols, start, end));
        }

        @Override
        public String toString() {
            return new String(symbols);
        }
    }
}



public class Test {
    public static void main(String[] args) {
    }
    public static class Box<T> {
        private T object;
        public static <T> Box <T> getBox() {
            return new Box<T>();
        }
    }
}

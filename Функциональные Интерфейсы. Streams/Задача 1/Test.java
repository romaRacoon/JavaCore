import java.util.function.UnaryOperator;

public class Test {
    public static void main(String[] args) {

    }
    public UnaryOperator<Integer> sqrt() {
        return x -> x * x;
    }
}

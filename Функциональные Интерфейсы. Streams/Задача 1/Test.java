import java.util.*;
import java.util.function.UnaryOperator;

public class Test {
    public static void main(String[] args) {

    }
    public UnaryOperator<Integer> sqrt() {
        UnaryOperator<Integer> unaryOperator = x -> x * x;
        return unaryOperator;
    }
}

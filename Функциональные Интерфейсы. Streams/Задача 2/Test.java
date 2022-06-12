import java.util.*;
import java.util.function.UnaryOperator;

public class Test {
    public static void main(String[] args) {

    }
    public static interface NumberGenerator<T extends Number> {
        boolean cond(T arg);
    }
    public static NumberGenerator<? super Number> getGenerator() {
        NumberGenerator<Number> numberGenerator = x -> x.intValue() > 0;
        return numberGenerator;
    }
}

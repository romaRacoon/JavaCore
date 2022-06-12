import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {

    }
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return obj -> condition.test(obj) ? ifTrue.apply(obj) : ifFalse.apply(obj);
    }
}

import java.util.*;

public class Test {
    public static void main(String[] args) {

    }
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> symmetricDiff = new HashSet<T>(set1);
        symmetricDiff.addAll(set2);
        Set<T> tempSet = new HashSet<T>(set1);
        tempSet.retainAll(set2);
        symmetricDiff.removeAll(tempSet);
        return symmetricDiff;
    }
}

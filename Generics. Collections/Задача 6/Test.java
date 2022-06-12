import java.io.Reader;
import java.util.*;

public class Test {
    public static void main(String[] args) {

    }
    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> myMap = new HashMap<>();
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()) {
            String letterForName = scanner.next();
            Long letterForAmount = Long.valueOf(scanner.nextLong());
            myMap.merge(letterForName, letterForAmount, Long::sum);
        }
        return  myMap;
    }
}

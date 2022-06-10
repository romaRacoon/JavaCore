import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ByteArrayInputStream bais = new ByteArrayInputStream("Алексей 3000\nДмитрий 9000\nАнтон 3000\nАлексей 7000\nАнтон 8000".getBytes());
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(bais));
        System.out.println(getSalesMap(buffReader));;
    }
    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> myMap = new HashMap<>();
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()) {
            String letterForName = scanner.next();
            Long letterForAmount = Long.valueOf(scanner.nextLong());
            if (myMap.containsKey(letterForName)) {
                myMap.put(letterForName, myMap.get(letterForName) + letterForAmount);
            } else {
                myMap.put(letterForName, letterForAmount);
            }
        }
        return  myMap;
    }
}

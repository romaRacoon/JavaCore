public class Task {
    public static void main(String[] args) {
        System.out.println(charExpression(32));
    }
    public static char charExpression(int a) {
        return (char)('\\' + a);
    }
}

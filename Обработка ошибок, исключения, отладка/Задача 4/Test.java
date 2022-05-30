public class Test {
    public static void main(String[] args) {
        try (Car car = new Car()) {
            car.drive();
        } catch (Exception e) {
        }
    }
    public static class Car implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("Машина закрывается...");
        }
        public void drive() {
            System.out.println("Машина поехала.");
        }
    }
}

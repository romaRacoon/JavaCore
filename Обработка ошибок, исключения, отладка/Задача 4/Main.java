import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class Main {
    public static class Car implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("Машина закрывается...");
        }
        public void drive() {
            System.out.println("Машина поехала.");
        }
    }

    public static void main(String... args) {
        try (Car car = new Car()) {
            car.drive();
        } catch (RuntimeException e) {
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

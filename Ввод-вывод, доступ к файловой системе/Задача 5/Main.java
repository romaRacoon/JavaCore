import java.io.*;
import java.io.IOException;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

    }
    public static Animal[] deserializeAnimalArray(byte[] data) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        try (ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)) {
            int animalsAmount = objectInputStream.readInt();
            Animal[] animals = new Animal[animalsAmount];
            for (int i = 0; i < animalsAmount; i++) {
                animals[i] = (Animal) objectInputStream.readObject();
            }
            return animals;
        } catch (ClassNotFoundException | ClassCastException | NegativeArraySizeException | IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}

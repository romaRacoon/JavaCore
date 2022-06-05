import java.io.*;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        byte[] intermediate = null;
        try (
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(output)) {

            oos.writeInt(3);
            oos.writeObject(new Animal("Dog"));
            oos.writeObject(new Animal("Cat"));
            oos.writeObject(new Animal("Mouse"));

            output.flush();
            intermediate = output.toByteArray();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(intermediate));
        Animal[] animals = deserializeAnimalArray(intermediate);
        System.out.println(Arrays.toString(animals));
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
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        } catch (EOFException e) {
            try {
                throw new EOFException();
            } catch (EOFException ex) {
                throw new RuntimeException(ex);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

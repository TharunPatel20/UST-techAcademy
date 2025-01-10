import java.io.*;

public class SerializationHandler {
    public static void serializeLibrary(Library library, String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(library);
        }
    }

    public static Library deserializeLibrary(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Library) ois.readObject();
        }
    }
}

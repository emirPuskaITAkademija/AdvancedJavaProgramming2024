package ba.smoki.six.io;

import java.io.*;
import java.time.LocalDate;

/**
 * {@link java.io.ObjectOutputStream}
 * {@link java.io.ObjectInputStream}
 */
public class ObjectStreams {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setName("Kanita");
        persona.setSurname("Berbić");
        persona.setBirthday(LocalDate.of(2000, 1, 1));
        try (ObjectOutputStream ous = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/main/resources/persona.txt")))) {
            ous.writeObject(persona);
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/main/resources/persona.txt")))) {
            Persona kanita = (Persona) ois.readObject();
            System.out.println("Deserializirana Kanita: " + kanita.getName() + " " + kanita.getSurname()+"  " + kanita.getAge());
        } catch (ClassNotFoundException | IOException exception) {
            System.err.println(exception.getMessage() + " prilikom čitanja");
        }
    }
}

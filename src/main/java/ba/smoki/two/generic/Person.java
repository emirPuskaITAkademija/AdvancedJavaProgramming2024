package ba.smoki.two.generic;

import java.io.Closeable;
import java.io.IOException;
import java.time.LocalDate;

public class Person implements Closeable {

    private String name;
    private String surname;
    private LocalDate birthday;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public void close() throws IOException {
        System.out.println("Taman smo nešto skontali i dođosmo na AJP");
    }
}

package ba.smoki.six.io;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

public class Persona implements Serializable{
    private String name;
    private String surname;
    private LocalDate birthday;

    public Persona() {
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

    public int getAge(){
        LocalDate now = LocalDate.now();
        Period period = birthday.until(now);
        return period.getYears();
    }
}

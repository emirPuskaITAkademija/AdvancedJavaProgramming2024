package ba.smoki.seven.method;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private String surname;
    private Gender gender;
    private LocalDate birthday;

    public Person() {
    }

    public Person(String name, String surname, Gender gender, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthday = birthday;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void printToConsole() {
        System.out.println(name + " " + surname + "  " + gender);
    }

    public boolean isMale() {
        return gender.equals(Gender.MALE);
    }

    public boolean isFemale() {
        return gender.equals(Gender.FEMALE);
    }


    public boolean isUnknown(){
        return gender.equals(Gender.UNKNOWN);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }

    public int getAge() {
        Period period = birthday.until(LocalDate.now());
        return period.getYears();
    }
}

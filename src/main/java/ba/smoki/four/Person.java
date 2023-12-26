package ba.smoki.four;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private String surname;
    private Gender gender;
    private LocalDate birthday;


    public Person(){

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

    public void printPerson(){
        System.out.println(getName() + " " + getSurname() + ", rođen/a " + getBirthday() + " i ima " + getAge() + ", spol: " + getGender());    }

    public int getAge(){
        LocalDate now = LocalDate.now();
        Period period = birthday.until(now);
        return period.getYears();
    }
}

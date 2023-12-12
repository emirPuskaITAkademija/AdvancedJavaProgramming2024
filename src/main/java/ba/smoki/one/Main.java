package ba.smoki.one;

import ba.smoki.one.animal.*;
import ba.smoki.one.human.Employee;
import ba.smoki.one.human.Pensioner;
import ba.smoki.one.human.Person;
import ba.smoki.one.human.Student;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //student -> kojeg je tipa ?
        //Student, Person, Object
        Student student = new Student();
        student.setName("Kanita");
        student.setSurname("Berbić");
        student.setBirthday(LocalDate.of(2000, 1, 1));
        Cat cat = new Cat("Cicko");
        student.setAnimal(cat);
        student.getAnimal().playSound();
        Dog dog = new Dog("Pujdo");
        student.setAnimal(dog);
        student.getAnimal().playSound();

        printPerson(student);
        //employee -> koje je tipa ?
        //Employee, Person,
        Employee employee = new Employee();
        employee.setName("Ismet");
        employee.setSurname("Omerović");
        employee.setBirthday(LocalDate.of(1988, 1, 1));
        printPerson(employee);
        Cat cat1 = new Cat("Jerry");
        employee.setAnimal(cat1);
        employee.getAnimal().playSound();
        //pensioner -> kojeg je tipa ?
        Bird bird = new Bird("Trkačica");
        Pensioner pensioner = new Pensioner();
        pensioner.setName("Mile");
        pensioner.setSurname("Vukajlović");
        pensioner.setBirthday(LocalDate.of(1980, 1, 1));
        pensioner.setAnimal(new Hamster("Hrčko"));
        pensioner.getAnimal().playSound();
        Rabbit rabbit = new Rabbit("Bugs Bunny");
        pensioner.setAnimal(rabbit);
        pensioner.getAnimal().playSound();
        pensioner.setAnimal(bird);
        pensioner.getAnimal().playSound();
        printPerson(pensioner);
    }

    /**
     * Uvijek treba praviti zavisnost od super tipa.
     *
     * @param person
     */
    static void printPerson(Person person) {
        System.out.println(person.getName() + " " + person.getSurname() + " ," + person.getBirthday() + " i ima " + person.getAge() + " godina");
    }
/*
    static void printStudent(Student student){
        System.out.println(student.getName()+" "+student.getSurname()+" ,"+student.getBirthday());
    }

    static void printEmployee(Employee employee){
        System.out.println(employee.getName()+" "+employee.getSurname()+" ,"+employee.getBirthday());
    }

    static void printPensioner(Pensioner pensioner){
        System.out.println(pensioner.getName()+" "+pensioner.getSurname()+" ,"+pensioner.getBirthday());
    }

 */
}

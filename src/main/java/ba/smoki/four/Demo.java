package ba.smoki.four;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * 4 najvažnija funkcionalna interfesja:
 * <li>1. Predicate<E> -> tester element tipa E</li>
 * boolean test(E element);
 * <li>2. Supplier<E> -> dobavlja element tipa E </li>
 * E get();
 *
 *
 * <li>3. Consumer<E>-> konzumira element tipa E</li>
 * void accept(E element);
 *
 * <li>Function<T,R>  -> transformer uzima element tipa E i transformiše ga u element tipa R</li>
 * R apply(T taken);
 */
public class Demo {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        List<Person> personList = personDao.selectAll();
        //uslov -> konzumiramo person varijablu
        // Kada koristimo LAMBDA ?
        // Kada kreiramo objekat tipa FUNKCIONALNOG interfejsa
        // Onda umjesto operatora new možemo koristiti ->
        // Šta lambda radi ?
        //boolean test(T t);
        Predicate<Person> tester = pe -> pe.getGender().equals(Gender.MALE);
        Consumer<Person> consumer = p -> p.printPerson();
        processPersons(personList, p -> p.getGender().equals(Gender.MALE), p -> p.printPerson());
    }

    static void processPersons(List<Person> persons, Predicate<Person> tester, Consumer<Person> consumer) {
        for (Person person : persons) {
            if (tester.test(person)) {
                consumer.accept(person);
            }
        }
    }
/*
    static void printPersons(List<Person> persons) {
        for(Person person: persons){
            System.out.println(person.getName() + " " + person.getSurname() + ", rođen/a " + person.getBirthday() + " i ima " + person.getAge() + ", spol: " + person.getGender());
        }
    }

    static void printPersonsOlderThan(List<Person> persons, int age) {
        for(Person person: persons){
            if(person.getAge()>=age){
                System.out.println(person.getName() + " " + person.getSurname() + ", rođen/a " + person.getBirthday() + " i ima " + person.getAge() + ", spol: " + person.getGender());
            }
        }
    }

    static void printPersonsYoungerThan(List<Person> persons, int age) {
        for(Person person: persons){
            if(person.getAge()<age){
                System.out.println(person.getName() + " " + person.getSurname() + ", rođen/a " + person.getBirthday() + " i ima " + person.getAge() + ", spol: " + person.getGender());
            }
        }
    }

    static void printPersonsWithSpecificGender(List<Person> persons, Gender gender) {
        for(Person person: persons){
            if(person.getGender().equals(gender)){
                System.out.println(person.getName() + " " + person.getSurname() + ", rođen/a " + person.getBirthday() + " i ima " + person.getAge() + ", spol: " + person.getGender());
            }
        }
    }

    static void printPersonsWithinAgeRange(List<Person> persons, int ageLow, int ageHigh) {
        for(Person person: persons){
            if(person.getAge()>=ageLow && person.getAge()<=ageHigh){
                System.out.println(person.getName() + " " + person.getSurname() + ", rođen/a " + person.getBirthday() + " i ima " + person.getAge() + ", spol: " + person.getGender());
            }
        }
    }
    */

}

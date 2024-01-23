package ba.smoki.seven;

import ba.smoki.seven.method.Gender;
import ba.smoki.seven.method.Person;
import ba.smoki.seven.method.PersonDao;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * LAMBDA OPERATOR / METHOD REFERENCING
 * <p>
 * 4 važna:
 * <li>1. Supplier<T>    T get();</li>
 * <li>2. Consumer<T>   void accept(T element); </li>
 * </p>
 */
public class Main {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        //Kojeg je tipa varijabla personList ?
        //Collection , List, ArrayList
        List<Person> personList = personDao.selectAll();
//        for (int i = 0; i < personList.size(); i++) {
//            Person person = personList.get(i);
//            System.out.println(person);
//        }
//        for (Person person : personList) {
//            System.out.println(person);
//        }
        //T    Person
//        Consumer<Person> personConsumer = Main::printPerson;//static
//        Consumer<Person> personConsumer2 = Person::printToConsole;//instancna
//        Consumer<Person> personConsumer3 = new PersonConsumer();
//        Consumer<Person> personConsumer4 = personConsumer3::accept;//instancna
//        Consumer<Person> personConsumer5 = System.out::println;
        //1. new
        //2. ->
        //3. ::
        Predicate<Person> personTester = p -> p.getGender().equals(Gender.FEMALE);
        Predicate<Person> personAgeTester = p -> p.getAge() <= 30;
        personList
                .stream()
                .filter(Person::isFemale)
                .filter(p -> p.getAge() <= 30)
                .filter(distinctByKey(Person::getSurname))
                .forEach(System.out::println);
    }

    static void printPerson(Person person) {
        System.out.println(person.getName() + " " + person.getSurname());
    }

    public static <T> Predicate<T> distinctByKey(
            Function<? super T, ?> keyExtractor) {

        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    static class PersonConsumer implements Consumer<Person> {

        @Override
        public void accept(Person person) {
            System.out.println(person.getSurname() + ", " + person.getName() + ": " + person.getAge());
        }
    }
}

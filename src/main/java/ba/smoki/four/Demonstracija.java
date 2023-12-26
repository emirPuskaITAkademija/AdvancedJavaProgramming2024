package ba.smoki.four;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Demonstracija {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        List<Person> personList = personDao.selectAll();
        Predicate<Person> test1 = p->p.getAge()<=23;
        Predicate<Person> test2 = p -> p.getGender().equals(Gender.MALE);
        Consumer<Person> consumer = p->p.printPerson();
        personList
                .stream()
                .filter(test1)
                .filter(test2)
                .forEach(p->p.printPerson());
    }
}

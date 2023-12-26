package ba.smoki.four;

import java.util.List;
import java.util.stream.Stream;

/**
 * <li>1. Tabelu u bazi persons -> person</li>
 * <li>2. Java klasu Person: </li>
 * <li>3. PersonDao -> List<Person> selectAll() </li>
 * <li>4. List<Person>  -> vizuelnu </li>
 */
public class PersonDemo {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        List<Person> personList = personDao.selectAll();
        //Spliterator
        // 1. izvor streama(Person elemenata)
        // 2. međuoperacije nad elementima stream(Person elementima)
        // 3. terminira stream(Person elementi)
        personList.stream()//1. izvor stream
                .filter(p -> p.getGender().equals(Gender.FEMALE))//2. međuoperacija
                .filter(p -> p.getAge() >= 18)
                .forEach(p -> System.out.println(p.getName() + " " + p.getSurname()));

        Stream<Person> personStream = personList.stream();
        personStream = personStream.filter(p->p.getGender().equals(Gender.FEMALE));
        personStream = personStream.filter(p->p.getAge()>=18);
        personStream.forEach(p-> System.out.println(p.getName()+" "+p.getSurname()));


        //Iterator pattern
//        for (Person person : personList) {
//            System.out.println(person.getName() + " " + person.getSurname());
//        }


//        PersonTester personTester = (per) -> per.getGender().equals(Gender.FEMALE);
////        PersonTester personTester2 = new PersonTester() {
////            @Override
////            public boolean test(Person person) {
////                return person.getSurname().equals("Omerović");
////            }
////        };
//        PersonTester personTester3 = person  -> person.getSurname().equals("Omerović");
//        PersonConsumer personConsumer = p -> System.out.println(p.getName() + " " + p.getSurname());
//        processPersons(personList, personTester, personConsumer);
    }

    static void processPersons(List<Person> persons, PersonTester personTester, PersonConsumer personConsumer) {
        for (Person person : persons) {
            if (personTester.test(person)) {
                personConsumer.konzumiraj(person);
            }
        }
    }
}

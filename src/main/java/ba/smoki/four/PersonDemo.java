package ba.smoki.four;

import java.util.List;

public class PersonDemo {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        List<Person> personList = personDao.selectAll();
        PersonTester personTester = (per) -> per.getGender().equals(Gender.FEMALE);
//        PersonTester personTester2 = new PersonTester() {
//            @Override
//            public boolean test(Person person) {
//                return person.getSurname().equals("Omerović");
//            }
//        };
        PersonTester personTester3 = person  -> person.getSurname().equals("Omerović");
        PersonConsumer personConsumer = p -> System.out.println(p.getName() + " " + p.getSurname());
        processPersons(personList, personTester, personConsumer);
    }

    static void processPersons(List<Person> persons, PersonTester personTester, PersonConsumer personConsumer) {
        for (Person person : persons) {
            if (personTester.test(person)) {
                personConsumer.konzumiraj(person);
            }
        }
    }
}

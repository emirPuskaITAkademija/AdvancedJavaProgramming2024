package ba.smoki.seven.method;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonDao {

    //List - NIZOVIMA
    public List<Person> selectAll(){
        List<Person> personList = new ArrayList<>();
        Person person = new Person("Kanita", "Berbić", Gender.FEMALE, LocalDate.of(2000, 1, 1));
        personList.add(person);
        personList.add(new Person("Kanita", "Berbić", Gender.FEMALE, LocalDate.of(2000, 1, 1)));
        personList.add(new Person("Arman", "Kovačević", Gender.MALE, LocalDate.of(1994, 1, 1)));
        personList.add(new Person("Ismet", "Omerović", Gender.MALE, LocalDate.of(1988, 1, 1)));
        personList.add(new Person("Nejra", "Kadrić", Gender.FEMALE, LocalDate.of(2003, 1, 1)));
        personList.add(new Person("Alen", "Botić", Gender.MALE, LocalDate.of(1986, 1, 1)));
        personList.add(new Person("Ferid", "Bobar", Gender.MALE, LocalDate.of(1998, 1, 1)));
        personList.add(new Person("Edvin", "Duran", Gender.MALE, LocalDate.of(1994, 1, 1)));
        personList.add(new Person("Emir", "Puška", Gender.UNKNOWN, LocalDate.of(1988, 1, 1)));
        personList.add(new Person("Mile", "Vukajlović", Gender.MALE, LocalDate.of(1984, 1, 1)));
        personList.add(new Person("Sanin", "Imamović", Gender.MALE, LocalDate.of(2000, 1, 1)));
        return personList;
    }
}

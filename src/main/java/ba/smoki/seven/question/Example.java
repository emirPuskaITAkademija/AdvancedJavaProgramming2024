package ba.smoki.seven.question;

import ba.smoki.seven.method.Person;
import ba.smoki.seven.method.PersonDao;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        List<Person> personList = personDao.selectAll();
        for(int i = 0;i<personList.size(); i++){

        }
    }
}

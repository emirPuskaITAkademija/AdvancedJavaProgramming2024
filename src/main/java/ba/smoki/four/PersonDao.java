package ba.smoki.four;

import ba.smoki.three.ConnectionPool;
import ba.smoki.three.Dao;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonDao implements Dao<Person> {
    private static String URL = "jdbc:mysql://localhost:3306/persons";

    @Override
    public void save(Person entity) {

    }

    @Override
    public Person select(long id) {
        return null;
    }

    @Override
    public List<Person> selectAll() {
        List<Person> personList = new ArrayList<>();
        //1. connection
        try (Connection connection = DriverManager.getConnection(URL, "root", "root");){
            //2. sql statement
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM person");
            //3. ResultSet
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){//boolean
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                Gender gender = resultSet.getString("gender").equals("MALE") ? Gender.MALE:Gender.FEMALE;
                LocalDate birthday = resultSet.getDate("birthday").toLocalDate();
                Person person = new Person(name, surname, gender, birthday);
                personList.add(person);
            }
        }catch (SQLException exception){
            System.err.println(exception.getMessage());
        }
        return personList;
    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Person t) {

    }
}

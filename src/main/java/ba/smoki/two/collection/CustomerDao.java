package ba.smoki.two.collection;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Povezat ćemo se s bazom:
 * <li>
 * 1. Connection->customers
 * </li>
 */
public class CustomerDao implements Dao<Customer> {

    //jdbc:mysql://localhost:3306/store
    @Override
    public List<Customer> selectAll() {
        List<Customer> customers = new ArrayList<>();
        try {
            //1. Connection
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //2. Upit ili Statement ili PreparedStatement ili CallableStatement
            Statement statement = connection.createStatement();
            //3. ResultSet -> kolekciju elemenata ili redova iz baze
            ResultSet resultSet = statement.executeQuery("SELECT * FROM customers");
            while (resultSet.next()){
                Long customerId = resultSet.getLong(1);//customer_id
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                LocalDate birthdate = resultSet.getDate("birth_date").toLocalDate();
                String phone = resultSet.getString("phone");
                String address = resultSet.getString("address");
                String city = resultSet.getString("city");
                String state = resultSet.getString("state");
                Integer points = resultSet.getInt("points");
                Customer customer = new Customer(customerId, firstName, lastName, birthdate, phone, address, city, state, points);
                customers.add(customer);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return customers;
    }

    @Override
    public Customer selectWhere(Long id) {
        return null;
    }
}

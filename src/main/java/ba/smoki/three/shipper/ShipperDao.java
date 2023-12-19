package ba.smoki.three.shipper;

import ba.smoki.three.Dao;
import ba.smoki.two.generic.Person;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShipperDao implements Dao<Shipper> {
    @Override
    public void save(Shipper entity) {

    }

    @Override
    public Shipper select(long id) {
        try(Person person = new Person()){

        }catch (Exception e){

        }
        return null;
    }


    @Override
    public List<Shipper> selectAll() {
        List<Shipper> shippers = new ArrayList<>();
        //1.7 try-with-resource
        try(Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)){
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM shippers");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Long shipperId = resultSet.getLong("shipper_id");
                String name = resultSet.getString("name");

                Shipper shipper = new Shipper();
                shipper.setShipperId(shipperId);
                shipper.setName(name);

                shippers.add(shipper);
            }
        }catch (SQLException exception){
            System.err.println(exception.getMessage());
        }
        return shippers;
    }

    @Override
    public void update(Shipper shipper) {

    }

    @Override
    public void delete(Shipper t) {

    }
}

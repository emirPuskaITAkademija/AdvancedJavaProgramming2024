package ba.smoki.two.collection;

import java.util.List;

/**
 * DAO Data Access Object
 * @param <E>
 */
public interface Dao<E>{

    String URL = "jdbc:mysql://localhost:3306/store";
    String USERNAME = "root";
    String PASSWORD = "root";

    List<E> selectAll();

    E selectWhere(Long id);
}

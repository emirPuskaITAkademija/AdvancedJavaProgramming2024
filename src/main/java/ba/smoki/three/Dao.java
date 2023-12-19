package ba.smoki.three;

import java.util.List;

/**
 * CRUD
 * <p>
 * <li>
 * Create, Retrieve, Update Delete
 * </li>
 * DAO -> Data Access Object
 * </p>
 *
 * @param <E>
 */
public interface Dao<E> {
    /*
    1. Konekcija s bazom Connection connection
    2. SQL izraz kreirati ili Statement (SELECT * FROM e)
    3. ResultSet
     */
    String URL = "jdbc:mysql://localhost:3306/store";
    String USERNAME = "root";
    String PASSWORD = "root";

    void save(E entity);

    E select(long id);

    List<E> selectAll();


    void update(E e);

    void delete(E t);
}

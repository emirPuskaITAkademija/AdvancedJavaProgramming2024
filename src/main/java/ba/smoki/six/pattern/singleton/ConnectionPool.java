package ba.smoki.six.pattern.singleton;

/**
 * <li>1. privatni poziv konstruktora: private</li>
 * <li>2. kreirati tu jednu instancu: EAGER ili LAZY</li>
 * <li>3. moramo omogućiti korištenje te instance ili tog singletona</li>
 */
public class ConnectionPool {

    private static ConnectionPool connectionPool = null;

    private ConnectionPool(){

    }

    public static ConnectionPool getSingleton(){
        if(connectionPool == null){
            connectionPool = new ConnectionPool();
        }
        return connectionPool;
    }
}

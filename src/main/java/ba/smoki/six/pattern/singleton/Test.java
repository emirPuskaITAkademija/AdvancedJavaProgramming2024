package ba.smoki.six.pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ConnectionPool connectionPool = ConnectionPool.getSingleton();
        ConnectionPool connectionPool1 = ConnectionPool.getSingleton();
        System.out.println(connectionPool1.hashCode());
        System.out.println(connectionPool.hashCode());
        //REFLEKSIJA
        Constructor constructor = ConnectionPool.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        ConnectionPool connectionPool2 = (ConnectionPool) constructor.newInstance();
        System.out.println(connectionPool2.hashCode());
    }
}

package ba.smoki.nadoknada.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Postoji 6 načina da se razbije singleton:
 * <li>1. Refleksija</li>
 *    java.lang.reflect
 * <li>2. Serijalizcija/Deserijalizacija</li>
 * <li>3. clone</li>
 * <li>4. multi-thread</li>
 * <li>5. class laoders</li>
 * <li>6. garabage collection</li>
 */
public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton singleton = Singleton.getInstance();
        print("singleton", singleton);
        Singleton singleton2 = Singleton.getInstance();
        print("singleton2", singleton2);
        Singleton singleton3 = Singleton.getInstance();
        print("singleton3", singleton3);
        Singleton singleton4 = Singleton.getInstance();
        print("singleton4", singleton4);
        Singleton singleton5 = Singleton.getInstance();
        print("singleton5", singleton5);
        //REFLEKSIJA..java.lang.reflect
        Class clazz = Singleton.class;
        Constructor<Singleton> singletonConstructor =  clazz.getDeclaredConstructor();
        singletonConstructor.setAccessible(true);
        Singleton singleton6 = singletonConstructor.newInstance();
        print("singleton6", singleton6);
    }

    static void print(String variableName, Singleton object) {
        System.out.println(String.format("Object: %s, HashCode: %s", variableName, object.hashCode()));
    }
}

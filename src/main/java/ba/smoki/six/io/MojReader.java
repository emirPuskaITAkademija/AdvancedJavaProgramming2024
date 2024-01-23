package ba.smoki.six.io;

import ba.smoki.one.human.Person;

import java.io.Closeable;

public final class MojReader implements AutoCloseable {
    public static final Person outPerson = new Person();
    @Override
    public void close() throws Exception{
        System.out.println("Moj readeru i ti se zatvori...");
    }
}

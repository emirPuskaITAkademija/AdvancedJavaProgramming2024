package ba.smoki.one;

import ba.smoki.one.human.Person;

@FunctionalInterface
public interface PersonTester {
    boolean test(Person person);
}

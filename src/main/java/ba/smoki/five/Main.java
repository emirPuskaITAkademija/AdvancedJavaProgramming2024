package ba.smoki.five;

import ba.smoki.five.example.Factory;
import ba.smoki.one.human.Pensioner;
import ba.smoki.one.human.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * <li>CREATIONAL</li>
 * <li>BEHAVIOUR</li>
 * <li>STRUCTURE</li>
 */
public class Main {
    public static void main(String[] args) {
        Person person = Factory.create("student");
        System.out.println((person instanceof Pensioner) ? "penzioner":"nije penzioner");

        Collection<String> kolekcija = new ArrayList<>();
        kolekcija.add("Ismet");
        kolekcija.add("Ismet");
        kolekcija.add("Nejra");
        kolekcija = new HashSet<>(kolekcija);
        for (String s : kolekcija) {
            System.out.println(s);
        }
    }
}

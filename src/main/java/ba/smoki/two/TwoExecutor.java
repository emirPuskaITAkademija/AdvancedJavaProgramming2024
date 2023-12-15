package ba.smoki.two;


import ba.smoki.two.generic.Box;
import ba.smoki.two.generic.Person;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/*
  Teme:
  <li>1. Generički tip podataka
  <li>2. Kolekcija ili Collection API
  <li>3. JDBC API -> DB
 */
public class TwoExecutor {
    public static void main(String[] args) {
        //2.1 SIROVI SLOZENI TIP
        Person person1 = new Person();
        person1.setName("Nejra");
        person1.setSurname("Kadrić");
        person1.setBirthday(LocalDate.of(2000, 1, 1));
        //2.2 PARAMETRIZIRANI SLOZENI TIP
        Box<Integer, Double, Person> kutija = new Box<>();
        kutija.setUltra(23);
        kutija.setViolentno(23.5);
        kutija.setZracenje(person1);

        Box<BigDecimal, Double, Person> kutija2 = new Box<>();

        float n1 = 0.3f;
        double n2 = 0.3;
        System.out.println(n1==n2);
        BigDecimal number1 = new BigDecimal("0.3");
        BigDecimal number2 = new BigDecimal("0.3");
        System.out.println(number1.compareTo(number2) == 0);
    }
}

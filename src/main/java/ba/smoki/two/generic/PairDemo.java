package ba.smoki.two.generic;

import ba.smoki.one.animal.Animal;
import ba.smoki.one.animal.Dog;
import ba.smoki.one.animal.Hamster;
import ba.smoki.one.human.Employee;
import ba.smoki.one.human.Student;

public class PairDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Mohamad Amin");
        student.setSurname("Jarraya Salihović");

        Dog dog = new Dog("Bethowen");

        Employee employee = new Employee();
        employee.setName("Kanita");
        employee.setSurname("Berbić");

        Hamster hamster = new Hamster("Toro");

        //SIROVI ili ROW TYPE
        Pair pair = new Pair();
        pair.setPerson(student);
        pair.setAnimal(dog);

        //PARAMETRIZIRANI
        Pair<Student, Hamster> studentHrcakPar = new Pair<>();
        studentHrcakPar.setAnimal(hamster);
        studentHrcakPar.setPerson(student);
    }
}

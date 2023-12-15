package ba.smoki.two.generic;

import ba.smoki.one.animal.Animal;

public class Pair<K extends ba.smoki.one.human.Person, V extends Animal>{
    private K person;
    private V animal;

    public void setPerson(K person) {
        this.person = person;
    }

    public K getPerson() {
        return person;
    }

    public void setAnimal(V animal) {
        this.animal = animal;
    }

    public V getAnimal() {
        return animal;
    }
}

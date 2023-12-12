package ba.smoki.one.animal;

import ba.smoki.one.Flyable;

public class Bird extends Animal implements Flyable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Ćiu Ćiu Ćiu..");
    }

    @Override
    public void fly() {
        System.out.println("Ja sam ptica i imam krila i letim...");
    }
}

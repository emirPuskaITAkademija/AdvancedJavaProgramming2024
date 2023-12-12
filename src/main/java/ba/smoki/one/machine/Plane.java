package ba.smoki.one.machine;

import ba.smoki.one.Flyable;

public class Plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Ja sam na mlazni pogon mašina i letim...");
    }
}

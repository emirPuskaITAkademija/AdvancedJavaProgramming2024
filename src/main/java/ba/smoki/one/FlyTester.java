package ba.smoki.one;

import ba.smoki.one.animal.Bird;
import ba.smoki.one.machine.Plane;

public class FlyTester {

    public static void main(String[] args) {
        Bird bird = new Bird("Tweety");
        simulateFly(bird);
        Plane plane = new Plane();
        simulateFly(plane);
        //Funkcionalni interfejs ima jednu i samo jednu apstraktnu metodu
        //LAMBDA operator - se veže samo za Functional Interface
        Flyable flyable = () -> System.out.println("Helikopter sam i letim");
        //flyable.fly();

    }

    static void simulateFly(Flyable flyable) {
        flyable.fly();
    }

//    static void simulateBirdFly(Bird bird){
//        bird.fly();
//    }
//
//    static  void simulatePlaneFly(Plane plane){
//        plane.fly();
//    }
}

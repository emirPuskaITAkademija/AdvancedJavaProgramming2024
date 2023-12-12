package ba.smoki.one.animal;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Mjau Mjau Mjau..");
    }
}

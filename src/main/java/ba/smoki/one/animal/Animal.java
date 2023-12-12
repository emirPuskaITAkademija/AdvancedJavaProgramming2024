package ba.smoki.one.animal;

public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void playSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

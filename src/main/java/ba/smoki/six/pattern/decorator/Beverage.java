package ba.smoki.six.pattern.decorator;

public abstract class Beverage {

    private double price;

    public Beverage(double price){
        this.price = price;
    }

    public abstract String name();

    public double getPrice() {
        return price;
    }
}

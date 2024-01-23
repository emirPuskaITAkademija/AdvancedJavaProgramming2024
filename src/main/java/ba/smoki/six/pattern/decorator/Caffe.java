package ba.smoki.six.pattern.decorator;

public class Caffe extends Beverage{
    public Caffe() {
        super(1.5);
    }

    @Override
    public String name() {
        return "Kafa ";
    }
}

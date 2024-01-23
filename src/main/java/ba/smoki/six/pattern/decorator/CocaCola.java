package ba.smoki.six.pattern.decorator;

public class CocaCola extends Beverage{
    public CocaCola() {
        super(3.5);
    }

    @Override
    public String name() {
        return "Coca Cola ";
    }
}

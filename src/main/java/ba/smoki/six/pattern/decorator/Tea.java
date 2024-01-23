package ba.smoki.six.pattern.decorator;

public class Tea extends Beverage{
    public Tea() {
        super(2.0);
    }

    @Override
    public String name() {
        return "Čaj ";
    }
}

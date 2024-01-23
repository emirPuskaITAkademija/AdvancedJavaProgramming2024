package ba.smoki.six.pattern.decorator;

public class MilkDecorator extends Beverage{
    private final Beverage beverage;

    public MilkDecorator(Beverage beverage){
        super(beverage.getPrice()+0.5);
        this.beverage = beverage;
    }

    @Override
    public String name() {
        return beverage.name()+ " s mlijekom";
    }
}

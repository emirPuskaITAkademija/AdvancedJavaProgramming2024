package ba.smoki.six;

import ba.smoki.six.pattern.decorator.Beverage;
import ba.smoki.six.pattern.decorator.Caffe;
import ba.smoki.six.pattern.decorator.MilkDecorator;
import ba.smoki.six.pattern.decorator.Tea;

public class Main {
    public static void main(String[] args) {
        //Caffe close for modification
        Caffe caffe = new Caffe();
        System.out.println(caffe.name()+"košta " + caffe.getPrice());
        //Kafa s mlijekom
        Beverage kafaSMlijekom = new MilkDecorator(new Caffe());
        System.out.println(kafaSMlijekom.name()+" košta "+kafaSMlijekom.getPrice());

        Beverage kafaDuploMlijeko = new MilkDecorator(new MilkDecorator(new Caffe()));
        System.out.println(kafaDuploMlijeko.name()+" košta " + kafaDuploMlijeko.getPrice());
        //Tea close for modification
        Tea tea = new Tea();
        System.out.println(tea.name()+"košta " +tea.getPrice());
        //Tea with milk
        Beverage beverage = new MilkDecorator(new Tea());
        System.out.println(beverage.name()+" košta " + beverage.getPrice());
    }
}

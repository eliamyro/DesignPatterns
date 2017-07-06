package decorator_pattern.condiments;

import decorator_pattern.beverages.Beverage;

/**
 * Created by eliamyro on 6/7/17.
 */
public class Soy extends CondimentDecorator{

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.19 + beverage.cost();
    }
}

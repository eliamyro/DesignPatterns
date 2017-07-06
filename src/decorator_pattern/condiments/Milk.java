package decorator_pattern.condiments;

import decorator_pattern.beverages.Beverage;

/**
 * Created by eliamyro on 6/7/17.
 */
public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 0.25 + beverage.cost();
    }
}

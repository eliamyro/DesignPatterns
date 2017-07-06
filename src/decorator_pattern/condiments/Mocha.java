package decorator_pattern.condiments;

import decorator_pattern.beverages.Beverage;

/**
 * Created by eliamyro on 6/7/17.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.4 + beverage.cost();
    }
}

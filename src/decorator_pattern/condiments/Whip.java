package decorator_pattern.condiments;

import decorator_pattern.beverages.Beverage;

/**
 * Created by eliamyro on 6/7/17.
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}

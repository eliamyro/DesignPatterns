package decorator_pattern.condiments;

import decorator_pattern.beverages.Beverage;

/**
 * Created by eliamyro on 6/7/17.
 */
public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();
}

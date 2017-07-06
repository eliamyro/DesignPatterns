package decorator_pattern.beverages;

/**
 * Created by eliamyro on 6/7/17.
 */
public abstract class Beverage {

    String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

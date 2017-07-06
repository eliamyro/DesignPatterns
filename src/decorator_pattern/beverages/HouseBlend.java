package decorator_pattern.beverages;

/**
 * Created by eliamyro on 6/7/17.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "The best house blend";
    }

    @Override
    public double cost() {
        return 3;
    }
}

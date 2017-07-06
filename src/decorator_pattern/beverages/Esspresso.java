package decorator_pattern.beverages;

/**
 * Created by eliamyro on 6/7/17.
 */
public class Esspresso extends Beverage {

    public Esspresso() {
        description = "The best esspresson in town.";
    }

    @Override
    public double cost() {
        return 1;
    }
}

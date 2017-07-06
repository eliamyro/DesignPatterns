package decorator_pattern.beverages;

/**
 * Created by eliamyro on 6/7/17.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Most Excellent Dark Roast";
    }

    @Override
    public double cost() {
        return 2;
    }
}

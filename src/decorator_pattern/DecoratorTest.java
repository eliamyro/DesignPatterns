package decorator_pattern;

import decorator_pattern.beverages.Beverage;
import decorator_pattern.beverages.DarkRoast;
import decorator_pattern.condiments.Mocha;
import decorator_pattern.condiments.Whip;

/**
 * Created by eliamyro on 6/7/17.
 */
public class DecoratorTest {

    public static void main(String[] args) {

        Beverage beverage = new DarkRoast();

        System.out.println(beverage.getDescription() + ": " + beverage.cost());

        beverage = new Whip(beverage);

        System.out.println(beverage.getDescription() + ": " + beverage.cost());

        beverage = new Mocha(beverage);

        System.out.println(beverage.getDescription() + ": " + beverage.cost());
    }
}

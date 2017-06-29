package strategy_pattern.behaviors;

/**
 * Created by eliamyro on 29/6/17.
 */
public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("I have a bow and many arrows.");
    }
}

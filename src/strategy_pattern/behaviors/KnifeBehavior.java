package strategy_pattern.behaviors;

/**
 * Created by eliamyro on 29/6/17.
 */
public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("My knife is small but deadly.");
    }
}

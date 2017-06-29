package strategy_pattern.behaviors;

/**
 * Created by eliamyro on 29/6/17.
 */
public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("I fight with a huge axe!");
    }
}

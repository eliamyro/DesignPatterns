package strategy_pattern.models;

import strategy_pattern.behaviors.SwordBehavior;

/**
 * Created by eliamyro on 29/6/17.
 */
public class Knight extends Character{

    public Knight() {
        weaponBehavior = new SwordBehavior();
    }
}

package strategy_pattern.models;

import strategy_pattern.behaviors.KnifeBehavior;

/**
 * Created by eliamyro on 29/6/17.
 */
public class Queen extends Character {

    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }
}

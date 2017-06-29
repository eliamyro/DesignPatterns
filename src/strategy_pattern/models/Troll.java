package strategy_pattern.models;

import strategy_pattern.behaviors.AxeBehavior;

/**
 * Created by eliamyro on 29/6/17.
 */
public class Troll extends Character {

    public Troll() {
        weaponBehavior = new AxeBehavior();
    }
}

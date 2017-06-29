package strategy_pattern.models;

import strategy_pattern.behaviors.BowAndArrowBehavior;

/**
 * Created by eliamyro on 29/6/17.
 */
public class King extends Character {

    public King(){
        weaponBehavior = new BowAndArrowBehavior();
    }

}

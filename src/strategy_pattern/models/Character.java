package strategy_pattern.models;

import strategy_pattern.behaviors.WeaponBehavior;

/**
 * Created by eliamyro on 29/6/17.
 */
public class Character {

    public WeaponBehavior weaponBehavior;

    public void fight(){
        weaponBehavior.useWeapon();
    }

    public  void setWeapon(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }
}

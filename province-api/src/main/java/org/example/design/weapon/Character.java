package org.example.design.weapon;

/**
 * @author fdrama
 * @date 2022/04/06
 **/
public abstract class Character {

    WeaponBehavior weaponBehavior;
    /**
     * fight
     */
    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}

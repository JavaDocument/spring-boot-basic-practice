package level6.module.domain.weapon.impl;

import level6.module.domain.weapon.abs.AbstractWeapon;

public class Bow extends AbstractWeapon {
    @Override
    protected int getWeaponDamage() {
        return 100;
    }
}
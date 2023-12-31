package level2.character;


import level2.weapon.Weapon;

public abstract class Character {

    protected Weapon weapon;
    protected String type;
    protected int basicPower;

    public void attack() {
        weapon.attack(type, basicPower);
    };

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    };
}

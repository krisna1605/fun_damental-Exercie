package Inheritance.JobCase;

public class Archer extends Job {

    private String weaponName;

    public Archer(String name, String gender, String abilty, int attackPoint, int defensePoint, String weaponName) {
        super(name, gender, abilty, attackPoint, defensePoint);
        this.weaponName = weaponName;
    }

    public String getWeaponName() {

        return weaponName;
    }

    public void setWeaponName(String weaponName) {

        this.weaponName = weaponName;
    }
}

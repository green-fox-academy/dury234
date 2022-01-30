package com.aircraftcarrier;

public class Aircraft {
    private int maxAmmo;
    private int baseDamage;
    private int ammoStorage;
    private AircraftType type;

    public Aircraft(AircraftType type) {
        this.type = type;
        ammoStorage = 0;
        if (type.equals(AircraftType.F35)) {
            baseDamage = 50;
            maxAmmo = 12;
        } else {
            baseDamage = 30;
            maxAmmo = 8;
        }
    }

    public int fight() {
        int damage = ammoStorage * baseDamage;
        ammoStorage = 0;
        return damage;
    }

    public void getStatus() {
        System.out.println("Type " +  getType() + ", Ammo: " + getAmmoStorage() + ", Base Damage: " + getBaseDamage() + ", All Damage: " + getBaseDamage() * getAmmoStorage());
    }

    public int refillAmmo(int ammo) {

        if (ammo >= (getMaxAmmo() - getAmmoStorage())) {

            int temp = getAmmoStorage();
            setAmmoStorage(getMaxAmmo());
            return ammo - (getMaxAmmo() - temp);

        } else {

            setAmmoStorage(getAmmoStorage() + ammo);
            return 0;

        }
    }

    public boolean isPriority() {
        return getType().equals(AircraftType.F35);
    }



    public void setType(AircraftType type) {
        this.type = type;
    }
    public AircraftType getType() {
        return type;
    }

    public int getAmmoStorage() {
        return ammoStorage;
    }
    public void setAmmoStorage(int ammoStorage) {
        this.ammoStorage = ammoStorage;
    }

    public int getBaseDamage() {
        return baseDamage;
    }
    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }
    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }
}

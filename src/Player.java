import TypeOfWeapon.*;

public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[] {
                new BigGun(),
                new Pistol(),
                new WaterPistol(),
                new MachineGun(),
                new Slingshot(),
                new RPG()
        };
    }

    public  int getSlotCount() {
        return weaponSlots.length;
    }

    public void showWithWeapon(int slot) {
        if (slot >= getSlotCount() || slot < -1) {
            System.out.println("IllegalArgumentException");
        } else {
            Weapon weapon = weaponSlots[slot];
            weapon.shot();
        }
    }
}
import TypeOfWeapon.*;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[]{
                new Automat(),
                new Gun(),
                new RPG(),
                new Slingshot(),
                new WaterPistol()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }
}
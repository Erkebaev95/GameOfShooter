import TypeOfWeapon.RPG;
import TypeOfWeapon.Rifle;
import TypeOfWeapon.WaterGun;
import TypeOfWeapon.Weapon;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Player player = new Player(new Weapon[]{
                new WaterGun(), new Rifle(), new RPG()
        });
        System.out.format(
                "У игрока %d слотов с оружием, введите номер, чтобы выстрелить, -1 чтобы выйти\n",
                player.getSlotsCount()
        );
        int slot;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            slot = Integer.parseInt(scanner.nextLine());
            if (slot == -1) {
                break;
            }
            player.shotWithWeapon(slot - 1);
        }
    }
}
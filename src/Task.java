import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            slot = scanner.nextInt();
            if (slot == -1) {
                System.out.println("Вы вышли из программы");
                break;
            }
            player.shotWithWeapon(slot - 1);
        }
    }
}
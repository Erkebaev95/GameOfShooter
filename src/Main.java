import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        System.out.format("У игрока %d слота(-ов) с оружием,"
                        + "введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotCount()
        );
        System.out.println("Если введете:  " +
                "\n0 - выстрел из Большого пушки" +
                "\n1 - выстрел из Пистолета" +
                "\n2 - выстрел из Водиного пистолета" +
                "\n3 - выстрел из Автомата" +
                "\n4 - выстрел из Рогатки" +
                "\n5 - выстрел из РПГ");
        int slot;

        do {
            Scanner scanner = new Scanner(System.in);
            slot = scanner.nextInt();
            if (slot == -1) {
                break;
            }
            player.showWithWeapon(slot);
        } while (1 != 0);
        System.out.println("Game Over");
    }
}
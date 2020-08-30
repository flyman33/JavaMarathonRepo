package day7;

public class Player {

    private int stamina;

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public Player(int stamina) {
        if(stamina < 90 || stamina > MAX_STAMINA) {
            System.out.println("Введено некорректное значение. Введите значение от 90 до 100.");
            return;
        }

        this.stamina = stamina;

        if(countPlayers < 6) {
            countPlayers++;
        }
    }

    public void run() {
        if(stamina > MIN_STAMINA) {
            stamina--;
            if(stamina == MIN_STAMINA) {
                countPlayers--;
            }
        }
    }

    public static void info() {
       if(countPlayers < 6) {
        switch (countPlayers) {
            case 0:
            case 1:
                System.out.println("Команды неполные, еще есть " + (6 - countPlayers) + " свободных мест");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Команды неполные, еще есть " + (6 - countPlayers) + " свободных места");
                break;
            case 5:
                System.out.println("Команды неполные, еще есть " + (6 - countPlayers) + " свободное место");
        }
       } else System.out.println("Мест в командах больше нет");
    }
}

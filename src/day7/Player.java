package day7;

import java.util.Random;

public class Player {

    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public Player() {
        Random random = new Random();

        this.stamina = 90 + random.nextInt(100 - 90 + 1);

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

package day7;

public class Task2 {

    public static void main(String[] args) {
        Player player1 = new Player(90);
        Player player2 = new Player(95);
        Player player3 = new Player(97);
        Player player4 = new Player(90);
        Player player5 = new Player(95);
        Player player6 = new Player(97);
        Player player7 = new Player(97);
        Player player8 = new Player(97);

        Player.info();

        for(int i = 0; i < 95; i++) {
            player1.run();
        }

        Player.info();
    }
}

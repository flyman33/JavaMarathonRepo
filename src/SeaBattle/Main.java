package SeaBattle;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Unit[][] player1Field = new Unit[10][10];
        Unit[][] player2Field = new Unit[10][10];
        Field f = new Field(player1Field);

        Unit battleShip = Unit.BATTLESHIP;
        Unit cruiser = Unit.CRUISER;
        Unit destroyer = Unit.DESTROYER;
        Unit torpedoBoat = Unit.TORPEDO_BOAT;

        Scanner scanner = new Scanner(System.in);

        while(true) {

                System.out.println("Начнем расставлять корабли на поле Player 1. Другой игрок, не смотри!");
                System.out.println("Введите координаты четырёхпалубного корабля (формат: x,y;x,y;x,y;x,y)");

                try {
                    enter(battleShip, f);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                    continue;
                }

            //Цикл повторяется два раза, потому что у нас 2 трехпалубных корабля
            for(int i = 0; i < 2; i++) {

                    String s = "первого";
                    if (i == 1) s = "второго";
                    System.out.println("Введите координаты " + s + " трехпалубного корабля (формат x,y;x,y;x,y)");

                    try {
                        enter(cruiser, f);
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                        i--;  // позволяет нам вернуться на итерацию назад, в случае ошибки
                    }
            }

            //Цикл повторяется два раза, потому что у нас 3 двухпалубных корабля
            for(int i = 0; i < 3; i++) {
                String s = "первого";
                if(i == 1) s = "второго";
                if(i == 2) s = "третьего";
                System.out.println("Введите координаты " + s + " двухпалубного корабля (формат x,y;x,y)");

                try {
                    enter(destroyer, f);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                    i--;
                }

            }

            //Цикл повторяется два раза, потому что у нас 4 однопалубных корабля
            for(int i = 0; i < 4; i++) {
                String s = "первого";
                if(i == 1) s = "второго";
                if(i == 2) s = "третьего";
                if(i == 3) s = "четвертого";
                System.out.println("Введите координаты " + s + " однопалубного корабля (формат x,y)");

                try {
                    enter(torpedoBoat, f);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                    i--;
                }
            }

            f.print();
        }
    }

    //Метод проверяет ввод координат пользователя (количество координат, допустимые значения).
    //Делит введеную строку формата x1,y1;x2,y2;x3,y3;x4,y4 на несколько частей по x,y. В результате чего
    //в метод check() передается два числа координат.
    public static void enter(Unit unit, Field f) throws IOException {

        String[] unitEnter = new Scanner(System.in).nextLine().split(";");

        if(unit == Unit.BATTLESHIP && unitEnter.length != 4) {
            throw new IOException("Количество координат больше или меньше необходимого");
        }

        if(unit == Unit.CRUISER && unitEnter.length != 3) {
            throw new IOException("Количество координат больше или меньше необходимого");
        }

        if(unit == Unit.DESTROYER && unitEnter.length != 2) {
            throw new IOException("Количество координат больше или меньше необходимого");
        }

        if(unit == Unit.TORPEDO_BOAT && unitEnter.length != 1) {
            throw new IOException("Количество координат больше или меньше необходимого");
        }


        int[] arr = new int[unitEnter.length];
        int[] arr2 = new int[unitEnter.length];

        int[][] check = new int[unitEnter.length][2];

        int coordX = 0;
        int coordY = 0;

        for(int i = 0; i < unitEnter.length; i++) {

            if(!(unitEnter[i].contains(","))) {
                throw new IOException("Некорректный ввод");
            }

            String[] part = unitEnter[i].split(",");


            int x = Integer.parseInt(part[0]);
            int y = Integer.parseInt(part[1]);
            if((x < 0 || x > 9) || (y > 9 || y < 0)) {
                throw new IOException("Допустимые значения координат: 0 - 9");
            }

            if(i == 0) {
                coordX = x;
                coordY = y;
                arr[0] = y;
                arr2[0] = x;
            }


            if(i > 0 && x == coordX) {
                arr[i] = y;
                if(arr[i] - arr[i - 1] != 1) {
                    throw new IOException("Координаты должны быть последовательными");
                }
            } else if(i > 0 && y == coordY) {
                arr2[i] = x;
                if(arr2[i] - arr2[i - 1] != 1) {
                    throw new IOException("Координаты должны быть последовательными");
                }
            }

                for(int k = 0; k < 2; k++) {
                    check[i][0] = x;
                    check[i][1] = y;

                }


        }
        System.out.println(Arrays.deepToString(check));
        f.set(check, unit);

        //for(int i = 0; i < check.length; i++) {
           // f.set(check[i][0], check[i][1], unit);

        //}
    }
}
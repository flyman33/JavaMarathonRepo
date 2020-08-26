package day3;

import java.util.Scanner;

/*
 Реализовать программу, которая в консоль выводит название страны, принимая на вход название города.
 Программа должна работать до тех пор, пока не будет введено слово “Stop”.
Реализовать, используя следующие данные: Москва, Владивосток, Ростов - Россия. Рим, Милан, Турин - Италия.
 Ливерпуль, Манчестер, Лондон - Англия. Берлин, Мюнхен, Кёльн - Германия. При вводе любого другого города вывести
 сообщение “Неизвестная страна”.

 */

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city;

        while (true) {
            System.out.println("Введите город...");

            city = scanner.nextLine();

            if (city.equals("Stop")) break;

            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}



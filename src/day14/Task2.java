package day14;
/*
Создать в папке проекта файл people.txt в котором хранятся имена и возраст людей.
Реализовать статический метод List<String> parseFileToStringList(), который считывает содержимое
этого файла и возвращает список, состоящий из значений имен и возрастов каждого человека.
Получить данный список в методе main() и распечатать его в консоль.
В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и
выводить в консоль сообщение “Файл не найден”. Помимо этого, если значение возраста отрицательно,
необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.

Пример ответа: [Mike 24, John 19, Anna 20, Miguel 5]

Пример содержания файла people.txt:
Mike 24
John 19
Anna 20
Miguel 5

 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            System.out.println(parseFileToStringList());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
    }

    public static List<String> parseFileToStringList() throws IOException {
        File file = new File("src/day14/people");
        List<String> list = new ArrayList<>();

            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()) {
                String[] arr = (scanner.nextLine().split(" "));

                if(Integer.parseInt(arr[1]) < 0)
                    throw new IOException();

                list.add(arr[0] + " " + arr[1]);

            }

        return list;

    }
}

package day14;
/*
Создать .txt файл в папке проекта, как показано в видео (урок 36, время 15:30).
Заполнить его вручную десятью произвольными числами. Реализовать программу, которая считает
всех чисел в этом файле и выводит ее на экран.
Если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и
выводить в консоль сообщение “Файл не найден”. Помимо этого, если чисел в файле меньше или больше 10,
необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/day14/test");

        try {
            Scanner scanner = new Scanner(file);
            String[] numbersString = scanner.nextLine().split(" ");
            scanner.close();

            int[] numbers = new int[numbersString.length];
            int sum = 0;

            for(int i = 0; i < numbersString.length; i++) {
                numbers[i] = Integer.parseInt(numbersString[i]);
                sum += numbers[i];
            }

            if(numbersString.length != 10) {
                throw new IOException();
            }

            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }

    }

}


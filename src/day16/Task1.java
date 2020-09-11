package day16;
/*
Реализовать программу, которая на вход принимает txt файл с целыми числами (можно использовать файл из задания 1 дня 14)
и в качестве ответа выводит в консоль среднее арифметическое этих чисел.
Ответ будет являться вещественным числом. В консоль необходимо вывести полную запись вещественного числа
(со всеми знаками после запятой) и сокращенную запись (с 3 знаками после запятой).
Пример:
Числа в txt файле: 5 2 8 34 1 36 77
Ответ: 23.285714285714285 --> 23,286
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/day16/test");

        Scanner scanner = new Scanner(file);
        int sum = 0;
        int count = 0;

        while(scanner.hasNextLine()) {                  //цикл while в случае, если строк в файле будет несколько
            String[] line = scanner.nextLine().split(" ");

            for(String number : line) {
                sum += Integer.parseInt(number);
            }

            count += line.length;
        }

        double result = (double) sum / count;

        System.out.print(result + " --> ");
        System.out.printf("%.3f", result);
    }
}

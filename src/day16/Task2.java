package day16;
/*
Реализовать программу, записывающую числа разных типов в 2 файла.
Файл 1 содержит 1000 случайных чисел от 0 до 100.
Файл 2 создается на основании Файла 1, но содержит числа вещественного типа данных.
Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из Файла 1 рассчитывается их среднее
арифметическое. Затем, полученное значение записывается в Файл 2. Таким образом в Файле 2 будет находиться 50
вещественных чисел (1000 / 20 = 50).
После того, как Файл 2 будет сформирован, необходимо найти сумму всех вещественных чисел из Файла 2 и вывести в
консоль ответ, отбросив его вещественную часть.
Пример:
Для простоты, в Файле 1 находится 12 целых чисел, а среднее арифметическое рассчитывается для группы из 4 целых чисел.

Файл 1: 3 8 7 5 28 73 4 1 5 32 89 12
Файл 2: 5.75 26.5 34.5
Ответ: 66

Комментарии к примеру:
Среднее арифметическое для четверки 3 8 7 5 равно 5.75
Таким же образом рассчитаны средние арифметические для остальных четверок из Файла 1.
Сумма вещественных чисел из Файла 2 равняется 66.75
Отбросив вещественную часть (числа после запятой) получаем ответ 66.

 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("src/day16/file1");
        File file2 = new File("src/day16/file2");

        PrintWriter printWriter = new PrintWriter(file1);
        PrintWriter printWriter2 = new PrintWriter(file2);
        Scanner scanner = new Scanner(file1);

        for(int i = 0; i < 1000; i++) {
            printWriter.print(new Random().nextInt(101) + " ");
        }
        printWriter.close();

        int counter = 0;
        double sum = 0;
        double sumFile2 = 0;

        while(scanner.hasNext()) {
            sum += scanner.nextInt();
            counter++;

            if(counter == 20) {
                double average = sum / 20;
                printWriter2.print(average + " ");
                sumFile2 += average;
                counter = 0;
                sum = 0;
            }
        }

        scanner.close();
        printWriter2.close();

        System.out.println((int)sumFile2);
    }
}

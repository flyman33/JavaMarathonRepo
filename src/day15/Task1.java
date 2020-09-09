package day15;
/*
Вам дан файл с информацией об остатках обуви на складе, это пример реальной выгрузки остатков из 1С в csv файл
(формат файла с разделителями, в качестве разделителя использован символ “;”). В этом файле содержится информация о
названии модели обуви, ее размер и оставшееся на складе количество.

До преобразования в csv это была таблица с тремя колонками:

Название 						   Размер	   Кол-во
Ботинки HS РАН-Р 400 чер. ЗП			45		4
Ботинки PANDA САНИТАРИ 3916 S1 SRC бел.	37		1
...

Необходимо сформировать новый файл с информацией о моделях и размерах обуви, которой нет на складе (количество = 0). Для этого реализуйте программу, которая принимает на вход csv файл и создает новый txt файл следующего содержания (должно получиться 11 строк):

Ботинки СВАРЩИК ут М.1398 ЗП, 40, 0
Ботинки СВАРЩИК ут М.1398 ЗП, 45, 0
Ботинки ТОФФ БЕРКУТ И с выс.берцами ут ч, 38, 0

 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File in = new File("src/day15/shoes.csv");
        File out = new File("src/day15/output");

        try {
            Scanner scanner = new Scanner(in);
            PrintWriter printWriter = new PrintWriter(out);

            while(scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(";");
                int remainder = Integer.parseInt(line[2]);

                if(remainder == 0) {
                    printWriter.println(line[0] + ", " + line [1] + ", " + line[2]);
                }
            }

            scanner.close();
            printWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

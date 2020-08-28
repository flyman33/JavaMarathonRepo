package day4;

/*
С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить
его случайными числами от 0 до 10. Затем вывести содержимое массива в консоль, а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n = scanner.nextInt();

        int biggerThahEight = 0;
        int equalsOne = 0;
        int even = 0;
        int notEven = 0;
        int sum = 0;

        int[] array = new int[n];
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;

            if(array[i] > 8) biggerThahEight++;
            if(array[i] == 1) equalsOne++;
            if(array[i] % 2 == 0) even++;
            else notEven++;

            sum += array[i];
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + biggerThahEight);
        System.out.println("Количестве чисел равных 1: " + equalsOne);
        System.out.println("Количестве четных чисел: " + even);
        System.out.println("Количестве нечетных чисел: " + notEven);
        System.out.println("Сумме всех элементов массива: " + sum);
    }

}

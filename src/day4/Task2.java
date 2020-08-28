package day4;
/*
Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Затем, используя циклы for each вывести:
наибольший элемент массива
наименьший элемент массива
количество элементов массива, оканчивающихся на 0
сумму элементов массива, оканчивающихся на 0

Использовать сортировку запрещено.

 */

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        int max = 0;
        int min = Integer.MAX_VALUE;
        int endsZero = 0;
        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        for(int s : array) {
            if(s > max) max = s;
            if(s < min) min = s;
            if(s % 10 == 0) {
                endsZero++;
                sum += s;
            }
        }

        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массив: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + endsZero);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);

    }

}

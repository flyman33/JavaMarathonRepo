package day4;

/*
Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой выведите значение
суммы и индекс первого элемента тройки.

Пример:
*Для простоты пример показан на массиве размера 10

[1, 456, 1025, 65, 954, 5789, 4, 8742, 1040, 3254]

Тройка с максимальной суммой: [5789, 4, 8742]

Вывод в консоль:
14535
5

*Пояснение. Первое число - сумма тройки [5789, 4, 8742]. Второе число - индекс первого элемента тройки,
 то есть индекс числа 5789.
 */

import java.util.Arrays;
import java.util.Random;

public class Task4 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[100];
        int sum = 0;
        int max = 0;
        int index = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        for(int i = 0; i <= array.length - 3; i++) {
            for(int j = i; j < i + 3; j++) {
                sum += array[j];
            }

            if(sum > max) {
                max = sum;
                index = i;
            }

            sum = 0;

        }

        System.out.println(max);
        System.out.println(index);

    }

}

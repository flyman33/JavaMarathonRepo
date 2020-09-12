package day18;
/*
Вам дан числовой массив произвольного размера. Посчитайте сумму чисел в этом массиве не используя циклы
(необходимо использовать рекурсивные вызовы).

Пример:
int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
System.out.println(someMethod(...)); // 65346

*Вместо someMethod(...) должен быть ваш рекурсивный метод, который вернет сумму чисел в массиве numbers.
 */

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(sumNumbers(arr, 0));

    }

    public static int sumNumbers(int[] arr, int i) {

        if(i == arr.length - 1)
            return arr[arr.length - 1];

        return arr[i] + sumNumbers(arr, i + 1);
    }
}

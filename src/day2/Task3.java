package day2;

import java.util.Scanner;

//Реализовать программу №2, используя цикл while.

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа a и b...");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();

        a++;
        while(a < b) {
            if(a % 5 == 0 && a % 10 != 0)
                System.out.print(a + " ");
            a++;
        }
    }

}

package day12;
/*
Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка. Распечатать список.
 */

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> listCar = new ArrayList<>();
        listCar.add("Toyota");
        listCar.add("BMW");
        listCar.add("Honda");
        listCar.add("Subaru");
        listCar.add("Hyundai");

        listCar.add(2, "FIAT");

        listCar.remove(0);

        System.out.println(listCar);
    }
}

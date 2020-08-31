package day7;
/*
Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
В классе Самолет создать статический метод, который в качестве аргументов принимает два
объекта класса Airplane (два самолета) и выводит сообщение в консоль о том, какой из самолетов длиннее.
 */

public class Task1 {

    public static void main(String[] args) {
        Plane plane1 = new Plane("Boeing", 2015, 30, 40000);
        Plane plane2 = new Plane("Boeing", 2017, 40, 43000);
        plane1.fillUp(1000);
        plane1.fillUp(3000);

        Plane.longerPlane(plane1, plane2);
    }
}

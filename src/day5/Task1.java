package day5;
/*
Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
Создать геттеры и сеттеры для каждого поля. Создать экземпляр класса Автомобиль,
задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
Созданный вами класс должен отвечать принципам инкапсуляции.

 */

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("White");
        car.setModel("Camry");
        car.setYear(2020);

        System.out.println(car.getColor());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}

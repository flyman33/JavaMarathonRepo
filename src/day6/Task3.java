package day6;
/*
Создать класс "Преподаватель", имеющий поля “ФИО”, “Предмет”. Создать класс "Студент" с полем “ФИО”.
Каждый класс имеет конструктор (с параметрами), все set и get методы, а также у преподавателя есть метод
"оценить студента" принимающий в параметры студента, и работающий следующим образом: генерируется случайное
число от 2 до 5, выводится строка: "Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА по
предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
Все слова, написанные большими буквами, должны быть заменены соответствующими значениями.
ОЦЕНКА должна принимать значения "отлично”, "хорошо”, "удовлетворительно" или "неудовлетворительно",
в зависимости от значения случайного числа.
Создайте по 1 экземпляру каждого класса, у преподавателя вызовите метод оценки студента, передав
студента в качестве аргумента метода.

 */

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Анна", "Биология");
        Student student = new Student("Владимир");

        teacher.estimate(student);
    }
}
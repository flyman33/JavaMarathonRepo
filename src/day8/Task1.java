package day8;

public class Task1 {

    public static void main(String[] args) {
        String string = "";
        StringBuilder sb = new StringBuilder();

        long start = System.currentTimeMillis();
        for(int i = 1; i <= 20000; i++) {
            string += i + " ";
        }
        System.out.println(string);
        long end = System.currentTimeMillis();

        System.out.println("Время работы программы с конкатенацией обычных строк: " + (end - start));

        long start2 = System.currentTimeMillis();
        for(int i = 1; i <= 20000; i++) {
            sb.append(i + " ");
        }
        System.out.println(sb.toString());
        long end2 = System.currentTimeMillis();

        System.out.println("Время работы программы с использованием StringBuilder: " + (end2 - start2));
    }
}

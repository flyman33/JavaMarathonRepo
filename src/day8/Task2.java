package day8;

public class Task2 {

    public static void main(String[] args) {
        Plane plane = new Plane("Boeing", 2000, 150, 10000);
        plane.fillUp(5000);
        System.out.println(plane);
    }
}

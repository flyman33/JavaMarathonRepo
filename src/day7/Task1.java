package day7;

public class Task1 {

    public static void main(String[] args) {
        Plane plane1 = new Plane("Boeing", 2015, 30, 40000);
        Plane plane2 = new Plane("Boeing", 2017, 40, 43000);
        plane1.fillUp(1000);
        plane1.fillUp(3000);

        Plane.longerPlane(plane1, plane2);
    }
}

package day6;

public class Motorbike {

    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    void display() {
        System.out.println("Это мотоцикл");
    }

    int differenceYears(int year) {
        return Math.abs(year - this.year);
    }
}

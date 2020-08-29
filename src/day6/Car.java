package day6;

public class Car {

    private int year;
    private String color;
    private String model;

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    void display() {
        System.out.println("Это автомобиль");
    }

    int differenceYears(int year) {
        return Math.abs(year - this.year);
    }

}

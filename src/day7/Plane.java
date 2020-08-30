package day7;

public class Plane {

    private String producer;
    private int year;
    private int length;
    private int weight;
    private int capacity;

    public Plane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.capacity = 0;
    }

    void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина " + length +
            ", вес " + weight + ", объем топлива в баке: " + capacity);
    }

    void fillUp(int fuel) {
        capacity = fuel;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public static void longerPlane(Plane planeOne, Plane planeTwo) {
        if(planeOne.length > planeTwo.length) System.out.println("Длина первого самолет больше второго");
        else System.out.println("Длина второго самолета больше первого");
    }

}

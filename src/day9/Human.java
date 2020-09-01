package day9;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

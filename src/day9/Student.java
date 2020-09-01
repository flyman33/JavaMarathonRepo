package day9;

public class Student extends Human {

    public Student(String name, String group) {
        super(name);
        this.group = group;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + super.getName());
    }

    private String group;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}

package day6;

import java.util.Random;

public class Teacher {

    private String name;
    private String subjectOfTeaching;

    Random random = new Random();

    public Teacher(String name, String subjectOfTeaching) {
        this.name = name;
        this.subjectOfTeaching = subjectOfTeaching;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjectOfTeaching() {
        return subjectOfTeaching;
    }

    public void setSubjectOfTeaching(String subjectOfTeaching) {
        this.subjectOfTeaching = subjectOfTeaching;
    }

    void estimate(Student s) {
        int grade = 2 + random.nextInt(5 - 2 + 1);
        String gradeString = "";
        switch (grade) {
            case 2: gradeString = "неудовлетворительно";
                    break;
            case 3: gradeString = "удовлетворительно";
                    break;
            case 4: gradeString = "хорошо";
                    break;
            case 5: gradeString = "отлично";
                    break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + s.getName() + " по предмету " +
                subjectOfTeaching + " на оценку " + gradeString);
    }

}

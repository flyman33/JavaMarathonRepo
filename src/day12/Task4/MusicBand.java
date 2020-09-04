package day12.Task4;


import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }


    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }

    public void transfer(MusicBand band) {
        for(String s : this.getMembers()) {
            band.getMembers().add(s);
        }

        this.getMembers().clear();
    }

    public void printBand() {
        System.out.println(getMembers());
    }
}

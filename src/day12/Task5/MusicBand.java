package day12.Task5;



import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<MusicArtists> members;

    public MusicBand(String name, int year, List<MusicArtists> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }


    public List<MusicArtists> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtists> members) {
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
        for(MusicArtists s : this.getMembers()) {
            band.getMembers().add(s);
        }

        this.getMembers().clear();
    }

    public void printBand() {
        System.out.println(getMembers());
    }
}

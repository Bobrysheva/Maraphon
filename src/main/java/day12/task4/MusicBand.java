package day12.task4;

import day12.task5.MusicArtist;

import java.util.List;

public class MusicBand {
    String band;
    int year;
    List<String> members;


    public String getBand() {

        return band;
    }

    public int getYear() {

        return year;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    public MusicBand(String band, int year, List<String> members) {
        this.band = band;
        this.year = year;
        this.members = members;
    }


    public static void transferMembers(MusicBand a, MusicBand b) {
        for (String x : a.getMembers())
            b.getMembers().add(x);
        a.getMembers().clear();
    }

    public  void printMembers() {
        System.out.println(getMembers());
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "band='" + band + '\'' +
                ", year=" + year +
                '}';
    }

}


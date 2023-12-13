package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    String band;
    int year;

    public String getBand() {
        return band;
    }

    public int getYear() {
        return year;
    }

    public MusicBand(String band, int year) {
        this.band = band;
        this.year = year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "band='" + band + '\'' +
                ", year=" + year +
                '}';
    }
}


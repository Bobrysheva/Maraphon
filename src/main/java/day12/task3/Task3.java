package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Enigma", 1988);
        MusicBand band2 = new MusicBand("Linkin Park", 1996);
        MusicBand band3 = new MusicBand("Muse", 1988);
        MusicBand band4 = new MusicBand("Bionic Jive", 1998);
        MusicBand band5 = new MusicBand("RHCP", 1983);
        MusicBand band6 = new MusicBand("My Chemical Romance", 2001);
        MusicBand band7 = new MusicBand("Arctic Monkeys", 1998);
        MusicBand band8 = new MusicBand("U2", 1976);
        MusicBand band9 = new MusicBand("The Killers", 2001);
        MusicBand band10 = new MusicBand("All Time Low", 2003);

        List<MusicBand> bands = new ArrayList<MusicBand>();
        bands.add(band1);
        bands.add(band2);
        bands.add(band3);
        bands.add(band4);
        bands.add(band5);
        bands.add(band6);
        bands.add(band7);
        bands.add(band8);
        bands.add(band9);
        bands.add(band10);

        Collections.shuffle(bands);
        System.out.println(bands);

        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand eachBand : bands) {
            if (eachBand.getYear() > 2000) {
                groupsAfter2000.add(eachBand);
            }
        }
        System.out.println(groupsAfter2000);
        System.out.println(bands);
    }
}

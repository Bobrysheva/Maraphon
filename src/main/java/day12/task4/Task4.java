package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> membersA = new ArrayList<>();
        membersA.add("Emma Bunton");
        membersA.add("Mel B");
        membersA.add("Melanie C");
        membersA.add("Geri Halliwell");
        membersA.add("Victoria Beckham*");

        MusicBand bandA = new MusicBand("Spice girls", 1994, membersA);

        List<String> membersB = new ArrayList<>();
        membersB.add("Jisoo");
        membersB.add("Jennie");
        membersB.add("Rosé");
        membersB.add("Lisa");

        MusicBand bandB = new MusicBand("Blackpink", 2016, membersB);

        MusicBand.transferMembers(bandA, bandB);
        bandA.printMembers();
        bandB.printMembers();

    }
}

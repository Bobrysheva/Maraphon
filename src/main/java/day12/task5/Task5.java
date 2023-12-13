package day12.task5;
import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        MusicArtist Emma = new MusicArtist("Emma Bunton", 42);
        MusicArtist Mel = new MusicArtist("Mel B", 41);
        MusicArtist Melanie = new MusicArtist("Melanie C", 39);
        MusicArtist Geri = new MusicArtist("Geri Halliwell", 40);
        MusicArtist Victoria = new MusicArtist("Victoria Beckham*", 42);

        List<MusicArtist> membersA = new ArrayList<>();
        membersA.add(Emma);
        membersA.add(Mel);
        membersA.add(Melanie);
        membersA.add(Geri);
        membersA.add(Victoria);

        MusicBand bandA = new MusicBand("Spice girls", 1994, membersA);

        MusicArtist Jisoo = new MusicArtist("Jisoo", 22);
        MusicArtist Jennie = new MusicArtist("Jennie", 19);
        MusicArtist Rose = new MusicArtist("Rosé", 21);
        MusicArtist Lisa = new MusicArtist("Lisa", 20);

        List<MusicArtist> membersB = new ArrayList<>();
        membersB.add(Jisoo);
        membersB.add(Jennie);
        membersB.add(Rose);
        membersB.add(Lisa);

        MusicBand bandB = new MusicBand("Blackpink", 2016, membersB);

        MusicBand.transferMembers(bandA, bandB);
        bandA.printMembers();
        bandB.printMembers();

    }
}

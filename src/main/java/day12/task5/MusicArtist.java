package day12.task5;

public class MusicArtist {
    String name;
    int age;

    @Override
    public String toString() {
        return "MusicArtist{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public  MusicArtist (String name, int age){
        this.name=name;
        this.age=age;


    }
}

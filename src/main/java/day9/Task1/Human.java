package day9.Task1;
public abstract class Human {
    private String name;

    Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Это человек с именем " + getName());


    }
}

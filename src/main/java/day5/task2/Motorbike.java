package day5.task2;

public class Motorbike {
    private String model;
    private String colour;
    private int releaseYear;

    Motorbike(String model, String colour, int releaseYear) {
        this.model = model;
        this.colour = colour;
        this.releaseYear = releaseYear;
    }

    protected String getModel() {
        return model;
    }

    protected String getColour() {
        return colour;
    }

    protected int getReleaseYear() {
        return releaseYear;
    }
}

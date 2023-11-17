package day5.task1;

public class Car {
    private String model;
    private String colour;
    private int releaseYear;

    protected void setModel(String model) {
        this.model = model;
    }

    protected void setColour(String colour) {
        this.colour = colour;
    }

    protected void setReleaseYear(int releaseYear) {
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

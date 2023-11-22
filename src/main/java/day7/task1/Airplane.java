package day7.task1;

public class   Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    Airplane() {
        ;
    }

    Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    void fillUp(int n) {
        System.out.println("Дозаправляю топливный бак самолета на " + n + " литров");
        fuel += n;
        System.out.println("В топливном баке самолета " + fuel + " литров");

    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.length > airplane2.length) {
            System.out.println("airplane1");
        } else if (airplane1.length < airplane2.length) {
            System.out.println("airplane2");
        } else {
            System.out.println("Самолеты имеют одинаковую длину");
        }
    }
}

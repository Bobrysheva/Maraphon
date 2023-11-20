package day6.task1;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Audi 100");
        car1.setColour("Yellow");
        car1.setReleaseYear(2020);

        car1.info();
        System.out.println(car1.yearDifference(2020));

        Motorbike moto1= new Motorbike("Ducati Diavel", "red - black", 2023);
        moto1.info();
        System.out.println(moto1.yearDifference(2016));
    }
}

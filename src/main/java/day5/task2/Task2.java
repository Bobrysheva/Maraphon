package day5.task2;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike("Ducati Diavel", "red - black", 2023);
        System.out.println(motorbike1.getModel());
        System.out.println(motorbike1.getColour());
        System.out.println(motorbike1.getReleaseYear());
    }
}

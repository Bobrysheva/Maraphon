package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> autoMarks = new ArrayList<>();
        autoMarks.add("BMV");
        autoMarks.add("Lada");
        autoMarks.add("Mitsubishi");
        autoMarks.add("Linkoln");
        autoMarks.add("Mersedes");

        System.out.println(autoMarks);

        autoMarks.add(2, "Toyota");
        autoMarks.remove(0);

        System.out.println(autoMarks);
    }
}

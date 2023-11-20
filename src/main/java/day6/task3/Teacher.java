package day6.task3;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void getName(String name) {
        this.name = name;
    }

    public void getSubject(String subject) {
        this.subject = subject;
    }

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
        public void evaluate (Student student){
            Random rn = new Random();
            int a = 2 + rn.nextInt(3);
            String mark = " ";
            switch (a) {
                case 2:
                    mark = "неудовлетворительно";
                    break;
                case 3:
                    mark = "удовлетворительно";
                    break;
                case 4:
                    mark = "хорошо";
                    break;
                case 5:
                    mark = "отлично";
                    break;
            }
            System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() + " по предмету " + this.subject + " на оценку " + mark);
        }
    }

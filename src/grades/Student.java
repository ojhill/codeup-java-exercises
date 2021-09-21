package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();

    }


    // returns the student's name
    public String getName(){
        System.out.println(name);
        return name;

    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
    grades.add(grade);

    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for(int grade: this.grades){
            sum += grade;
        }
         return (sum/grades.size());


    }

    public static void main(String[] args) {
        Student OJ = new Student("OJ");
        Student Kyla = new Student("Kyla");
        Student Byron = new Student("Byron");

        OJ.addGrade(80);
        OJ.addGrade(70);
        OJ.addGrade(60);
        OJ.addGrade(70);

        Kyla.addGrade(90);
        Kyla.addGrade(80);
        Kyla.addGrade(90);
        Kyla.addGrade(100);

        Byron.addGrade(50);
        Byron.addGrade(80);
        Byron.addGrade(90);
        Byron.addGrade(100);

        System.out.println(OJ.getGradeAverage());
        System.out.println(Kyla.getGradeAverage());
        System.out.println(Byron.getGradeAverage());
    }

}


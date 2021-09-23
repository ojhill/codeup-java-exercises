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
    public String getName() {
        System.out.println(name);
        return name;

    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);

    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return (sum / grades.size());


    }

}

